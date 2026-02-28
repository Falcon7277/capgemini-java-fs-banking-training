public class ExcelReportGenerator implements ReportGenerator {

    @Override
    public void generateReport(Object data) {
        if (!validate(data)) return;

        System.out.println("Generating Excel report at " + ReportGenerator.generateTimestamp());
        System.out.println("Excel Data: " + data);
    }
}
