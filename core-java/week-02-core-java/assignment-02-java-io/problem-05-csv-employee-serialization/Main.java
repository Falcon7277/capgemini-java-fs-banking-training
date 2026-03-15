import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String csvFile = "src/week2/day2/assign7/problem5/employees.csv";
        String serFile = "src/week2/day2/assign7/problem5/employees.ser";

        List<Employee> employeeList = readEmployeesFromCSV(csvFile);
        serializeEmployees(serFile, employeeList);
        deserializeEmployees(serFile);
    }

    private static List<Employee> readEmployeesFromCSV(String csvFile) {

        List<Employee> employeeList = new ArrayList<>();
        // reading the csv file and creating Student objects
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            String line;
            boolean isHeader = true;
            while ((line = br.readLine()) != null) {
                //for skipping the header line
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(",");
                String name = data[0];
                int id = Integer.parseInt(data[1]);
                double salary = Double.parseDouble(data[2]);
                employeeList.add(new Employee(name, id, salary));
            }

            System.out.println("Employee data read from CSV successfully.");
        }
        catch (IOException e) {
            System.out.println("Error reading CSV file: " + e.getMessage());
        }

        return employeeList;
    }

    //serialize employee list
    private static void serializeEmployees(String serFile, List<Employee> employeeList) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(serFile))) {

            oos.writeObject(employeeList);
            System.out.println("Employee list serialized successfully.");
        }
        catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
        }
    }

    //deserialize
    private static void deserializeEmployees(String serFile) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(serFile))) {

            List<Employee> deserializedList = (List<Employee>) ois.readObject();
            System.out.println("\nDeserialized Employee Details:");
            for (Employee emp : deserializedList) {
                System.out.println(emp);
            }
        }
        catch (IOException | ClassNotFoundException e) {// multi-catch just like or logical operator
            System.out.println("Deserialization error: " + e.getMessage());
        }
    }
}
