public class LendingBook extends Book {

    public LendingBook(String isbn, String title) {
        super(isbn, title);
    }

    @Override
    public boolean issueBook() {
        if (issuedCount >= libraryCapacity) {
            System.out.println("Library capacity reached. Cannot issue book.");
            return false;
        }

        issuedCount++;
        System.out.println("Book issued successfully: " + title);
        return true;
    }
}
