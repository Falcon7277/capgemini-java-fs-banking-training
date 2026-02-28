public class EmployeeApp {
    public static void main(String[] args) {

        Employee emp1 = new FullTimeEmployee(101, "Tanishq");
        Employee emp2 = new ContractEmployee(202, "Jatin");

        System.out.println("Company: " + Employee.getCompanyName());

        emp1.markAttendance();
        emp2.markAttendance();
    }
}
