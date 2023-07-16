public class Task3 {
    public static void main(String[] args) {
        Book book1 = new Book("Book1", "unknown");
        Book book2 = new Book("Book2", "unknown2");

        book2.unavailable();

        book1.displayInfo();
        book2.displayInfo();

        Library lib = new Library();
        lib.addBook(book1);
        lib.addBook(book2);

        lib.displayAvailableBooks();

        lib.searchByAuthor("unknown");
        lib.searchByAuthor("unknown2");
        lib.searchByAuthor("unknown3");
    }
}
