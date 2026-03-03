import java.util.Scanner;

public class NumberConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean validNumber = false;

        while (!validNumber) {
            System.out.print("Enter a number: ");
            String input = sc.nextLine();

            try {
                int number = Integer.parseInt(input);
                System.out.println("You entered: " + number);
                validNumber = true;
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid numeric value.");
            }
        }

        sc.close();
    }
}
