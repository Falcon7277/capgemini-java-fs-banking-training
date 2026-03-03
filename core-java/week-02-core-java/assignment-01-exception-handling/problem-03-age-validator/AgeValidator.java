import java.util.Scanner;

public class AgeValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try {
            validateAge(age);
            System.out.println("Age is valid. Access granted.");
        }
        catch (InvalidAgeException e) {
            System.out.println("Invalid Age: " + e.getMessage());
        }
    }

    public static void validateAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }
    }
}

