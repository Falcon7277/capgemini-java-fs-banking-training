import java.util.Scanner;

public class ArrayElementFetcher {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);
        boolean validIndex = false;

        while (!validIndex) {
            System.out.print("Enter index (0 to " + (arr.length - 1) + "): ");
            try {
                int index = sc.nextInt();
                System.out.println("Element at index " + index + ": " + arr[index]);
                validIndex = true;
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Index out of bounds. Please enter a valid index.");
            }
            catch (Exception e) {
                System.out.println("Invalid input. Please enter an integer index.");
                sc.next(); //clear the buffer
            }
        }

        sc.close();
    }
}
