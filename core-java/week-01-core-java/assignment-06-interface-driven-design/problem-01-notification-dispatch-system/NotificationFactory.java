import java.util.Map;

public class NotificationFactory {
    private static final Map<String, NotificationSystem> registry = Map.of("EMAIL", new EmailNotification(), "SMS", new SMSNotification(), "PUSH", new PushNotification());

    public static NotificationSystem getService(String channel) {//this method returns the required notification as per the requirements
        //this has been written because ReportGeneratorApp class cannot be mutated upon addition of a new service
        NotificationSystem service = registry.get(channel.toUpperCase());
        if (service == null) {
            throw new IllegalArgumentException("Unsupported notification channel");
        }
        return service;
    }
}
