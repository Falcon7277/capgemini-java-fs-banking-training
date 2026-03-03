import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean validEmail = false;

        while (!validEmail) {
            try {
                System.out.print("Enter your email: ");
                String email = sc.nextLine();
                validateEmail(email);
                System.out.println("Email registered successfully!");
                validEmail = true;
            }
            catch (InvalidEmailException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Please re-enter a valid email.\n");
            }
        }

        sc.close();
    }

    public static void validateEmail(String email) throws InvalidEmailException {

        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        if (email == null || !Pattern.matches(emailRegex, email)) {
            throw new InvalidEmailException("Invalid email format.");
        }
    }
}
