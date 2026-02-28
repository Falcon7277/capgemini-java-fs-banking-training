public abstract class Employee {
    protected final int employeeId;
    protected String name;
    protected static String companyName = "Capgemini technological limited";

    protected Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public abstract void markAttendance();

    public static String getCompanyName() {
        return companyName;
    }
}
