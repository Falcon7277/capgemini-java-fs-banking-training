import java.util.HashSet;
import java.util.Set;

public class EmailSubscriptionSystem {
    public static void main(String[] args) {
        Set<String> emailIDs = new HashSet<>();
        emailIDs.add("user1@gmail.com");
        emailIDs.add("user2@gmail.com");
        emailIDs.add("user3@gmail.com");
        emailIDs.add("user1@gmail.com"); // duplicate
        emailIDs.add("user4@gmail.com");
        emailIDs.add("user5@gmail.com");
        emailIDs.add("user2@gmail.com"); // duplicate
        emailIDs.add("user6@gmail.com");
        emailIDs.add("user7@gmail.com");
        emailIDs.add("user8@gmail.com");
        System.out.println("Total Unique Subscribers: " + emailIDs.size());
    }
}
