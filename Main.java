public class Main {
    public static void main(String[] args) {

        Lib library = new Lib("Central Library");


        Book book1 = new Book("12345", "Great Student", "Mosawer Wadan", "FICTION");
        Book book2 = new Book("54321", "Learning Java", "T.Alireza Nasoodi","SCIENCE");
        Book book3 = new Book("01234", "Git and GitHub", "T.Alireza Nasoodi"," HISTORY");
        Book book4 = new Book("02345", "Easy Java Programming", "T.Alireza Nasoodi"," FANTASY");
        Book book5 = new Book("03456", "How to become a Teacher", "T.Alireza Nasoodi","FICTION_NON");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);


        Member member1 = new Member("000001", "Massoud Wadan");
        Member member2 = new Member("000002", "Mohammad Wadan");

        library.addMember(member1);
        library.addMember(member2);

        member1.borrowBook(book2);
        book2.setTimesOfBorrow();
        member1.borrowBook(book4);
        book4.setTimesOfBorrow();
        member2.borrowBook(book5);
        book5.setTimesOfBorrow();

        member1.returnBook(book2);
        book2.setTimesOfBorrow();

        library.printLibraryInfo();
    }
}
