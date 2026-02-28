public class FullTimeEmployee extends Employee{
    protected FullTimeEmployee(int employeeId, String name) {
        super(employeeId, name);
    }

    @Override
    public void markAttendance() {
        System.out.println(
                "Full-time employee " + name +
                        " (ID: " + employeeId + ") marked present for full day."
        );
    }
}
