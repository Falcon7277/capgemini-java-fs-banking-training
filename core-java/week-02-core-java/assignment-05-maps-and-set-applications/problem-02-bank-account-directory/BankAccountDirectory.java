import java.util.HashMap;
import java.util.Map;

public class BankAccountDirectory {
    public static void main(String[] args) {

        Map<Integer, String> accountDirectory = new HashMap<>();
        accountDirectory.put(1001, "Tanishq");
        accountDirectory.put(1002, "Netal");
        accountDirectory.put(1003, "Jatin");
        accountDirectory.put(1004, "Ashwini");
        accountDirectory.put(1005, "Raj");

       //Searching customer using account number
        int searchAccount = 1003;
        System.out.println("Customer Name: " + accountDirectory.get(searchAccount));
        //Deleting an account
        int deleteAccount = 1002;
        accountDirectory.remove(deleteAccount);
        //Displaying updated directory
        System.out.println("\nUpdated Bank Account Directory:");
        for (Map.Entry<Integer, String> entry : accountDirectory.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
