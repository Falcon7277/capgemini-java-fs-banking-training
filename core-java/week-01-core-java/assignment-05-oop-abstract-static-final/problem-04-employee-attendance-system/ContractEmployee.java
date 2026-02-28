public class ContractEmployee extends Employee{
    protected ContractEmployee(int employeeId, String name) {
        super(employeeId, name);
    }

    @Override
    public void markAttendance() {
        System.out.println(
                "Contract employee " + name +
                        " (ID: " + employeeId + ") marked present for contract hours."
        );
    }
}
