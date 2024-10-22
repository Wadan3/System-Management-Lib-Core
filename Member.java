import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Member {
    private String memberId;
    private String name;
    private List<Book> borrowedBooks;
    private Address address;

    public Member(String memberId, String name) {
        if (memberId.length() != 6) {
            System.out.println("Invalid Member it should have 6 characters");
        }
        this.memberId = memberId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
        address = new Address();
    }
    public void upadateAddress(Address newAddress) {
        Scanner scanner = new Scanner(System.in);
        newAddress.setCity(scanner.nextLine());
        newAddress.setStreet(scanner.nextLine());
        newAddress.setZipCode(scanner.nextLine());
    }
    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public void borrowBook(Book book) {
        if (borrowedBooks.size() < 3 && book.isAvailable()) {
            borrowedBooks.add(book);
            book.borrow();
        } else {
            System.out.println("Cannot borrow book: either limit reached or book not available.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.returnBook();
        } else {
            System.out.println("This book was not borrowed by the member.");
        }
    }

    public void printMemberInfo() {
        System.out.print("Member ID: " + memberId + ", Name: " + name + ", Borrowed Books: ");
        if (borrowedBooks.isEmpty()) {
            System.out.println("None");
        } else {
            for (Book book : borrowedBooks) {
                System.out.print(book.getTitle() + " ");
            }
            System.out.println();
        }
    }

}