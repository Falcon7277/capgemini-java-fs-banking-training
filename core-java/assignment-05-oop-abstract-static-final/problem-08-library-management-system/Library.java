//This is the main code for this problem
public class Library {
    public static void main(String[] args) {
        Book refBook = new ReferenceBook("REF-101", "Java Reference");
        Book lendBook1 = new LendingBook("LEN-201", "Data Structures");
        Book lendBook2 = new LendingBook("LEN-202", "SQL Basic");

        refBook.issueBook();
        lendBook1.issueBook();
        lendBook2.issueBook();

        System.out.println("Available Capacity: " + Book.getAvailableCapacity());
    }
}
