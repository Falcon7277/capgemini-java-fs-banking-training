import java.util.Scanner;

public class UserAuthentication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter username: ");
            String username = sc.nextLine();
            System.out.print("Enter password: ");
            String password = sc.nextLine();
            authenticate(username, password);

        }
        catch (AuthenticationException e) {
            System.out.println("Authentication failed: " + e.getMessage());
        }
        sc.close();
    }

    public static void authenticate(String username, String password) throws AuthenticationException {

        if (username == null || password == null) {
            throw new AuthenticationException("Username or password cannot be null.");
        }

        System.out.println("Authentication successful.");
    }
}
