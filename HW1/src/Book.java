public class Book {
    String title = null;
    String author = null;
    boolean isAvailable = true;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void available()
    {
        this.isAvailable = true;
    }

    public void unavailable()
    {
        this.isAvailable = false;
    }

    public void displayInfo()
    {
        System.out.printf("Book title: %s, author: %s. Now book is ", this.title, this.author);
        if (!isAvailable) {
            System.out.print("un");
        }
        System.out.print("available.\n");
    }

    Book(String title, String author)
    {
        this.setTitle(title);
        this.setAuthor(author);
    }
}

