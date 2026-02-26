public class PdfReportGenerator implements ReportGenerator {

    @Override
    public void generateReport(Object data) {
        if (!validate(data)) return;

        System.out.println("Generating PDF report at " + ReportGenerator.generateTimestamp());
        System.out.println("PDF Data: " + data);
    }
}

