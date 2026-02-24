public class ReferenceBook extends Book {

    public ReferenceBook(String isbn, String title) {
        super(isbn, title);
    }

    @Override
    public boolean issueBook() {
        System.out.println("Reference books cannot be issued.");
        return false;
    }
}
