import java.util.Map;

public class ReportGeneratorFactory {

    private static final Map<String, ReportGenerator> generators = Map.of(
            "PDF", new PdfReportGenerator(),
            "EXCEL", new ExcelReportGenerator(),
            "JSON", new JsonReportGenerator()
    );

    public static ReportGenerator getGenerator(String type) {
        ReportGenerator generator = generators.get(type.toUpperCase());
        if (generator == null) {
            throw new IllegalArgumentException("Unsupported report format");
        }
        return generator;
    }
}

