import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileName = "src/week2/day2/assign7/problem3/tasks.txt";
        Scanner sc = new Scanner(System.in);

        writeTasksToFile(fileName, sc);
        readTasksFromFile(fileName);
        sc.close();
    }

    //writing tasks to the file
    private static void writeTasksToFile(String fileName, Scanner sc) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

            System.out.println("Enter your tasks (type 'exit' to finish):");
            while (true) {

                String task = sc.nextLine();
                if (task.equalsIgnoreCase("exit")){// if user types exit we will stop
                    break;
                }

                writer.write(task);
                writer.newLine(); //writes line separator specifically for a buffered writer,
                // is also platform independent
            }

            System.out.println("\nTasks saved successfully!");
        }
        catch (IOException e) {
            System.out.println("Error while writing tasks: " + e.getMessage());
        }
    }

    //reading from a file
    private static void readTasksFromFile(String fileName) {

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            System.out.println("\nYour To-Do List:");
            String task;
            while ((task = reader.readLine()) != null) {
                System.out.println("-> " + task);
            }
        }
        catch (IOException e) {
            System.out.println("Error while reading tasks: " + e.getMessage());
        }
    }

}
