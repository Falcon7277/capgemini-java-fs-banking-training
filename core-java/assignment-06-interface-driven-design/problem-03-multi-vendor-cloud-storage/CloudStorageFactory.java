import java.util.Map;

public class CloudStorageFactory {

    private static final Map<String, CloudStorageService> providers = Map.of(
            "AWS", new AwsStorageService(),
            "AZURE", new AzureStorageService(),
            "GCP", new GcpStorageService()
    );

    public static CloudStorageService getProvider(String type) {
        CloudStorageService service = providers.get(type.toUpperCase());
        if (service == null) {
            throw new IllegalArgumentException("Unsupported cloud provider");
        }
        return service;
    }
}
