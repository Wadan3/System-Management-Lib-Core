import java.util.ArrayList;
import java.util.List;

class Lib {
    private String name;
    private List<Book> books;
    private List<Member> members;

    public Lib(String name) {
        this.name = name;
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void borrowBook(Member member, Book book) {
        if (books.contains(book) && members.contains(member)) {
            member.borrowBook(book);
        }
    }

    public void returnBook(Member member, Book book) {
        if (books.contains(book) && members.contains(member)) {
            member.returnBook(book);
        }
    }

    public void printLibraryInfo() {
        System.out.println("Library Name: " + name);
        System.out.println("Books in Library:");
        for (Book book : books) {
            book.printBookInfo();
        }
        System.out.println("Members of Library:");
        for (Member member : members) {
            member.printMemberInfo();
        }
    }
}