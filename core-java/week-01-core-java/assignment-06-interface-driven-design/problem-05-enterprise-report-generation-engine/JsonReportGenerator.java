public class JsonReportGenerator implements ReportGenerator {

    @Override
    public void generateReport(Object data) {
        if (!validate(data)) return;

        System.out.println("Generating JSON report at " + ReportGenerator.generateTimestamp());
        System.out.println("JSON Data: " + data);
    }
}

