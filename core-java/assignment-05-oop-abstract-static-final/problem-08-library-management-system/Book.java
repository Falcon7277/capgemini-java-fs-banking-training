public abstract class Book {

    protected final String isbn;
    protected String title;

    protected static int libraryCapacity = 100;
    protected static int issuedCount = 0;

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public static int getAvailableCapacity() {
        return libraryCapacity - issuedCount;
    }

    public abstract boolean issueBook();
}
