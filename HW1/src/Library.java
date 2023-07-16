import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.Objects;

public class Library {
    ArrayList<Book> catalog = new ArrayList<>();

    public void addBook(Book book)
    {
        catalog.add(book);
    }

    public boolean removeBook(Book book)
    {
        return catalog.remove(book);
    }

    public void displayAvailableBooks()
    {
        for (Book book: catalog)
        {
            if (book.isAvailable())
            {
                book.displayInfo();
            }
        }
    }

    public void searchByAuthor(String author)
    {
        boolean noBooks = true;
        for (Book book: catalog)
        {
            if (Objects.equals(author, book.getAuthor()))
            {
                book.displayInfo();
                noBooks = false;
            }
        }
        if (noBooks)
        {
            System.out.println("No books were found. ");
        }
    }
}
