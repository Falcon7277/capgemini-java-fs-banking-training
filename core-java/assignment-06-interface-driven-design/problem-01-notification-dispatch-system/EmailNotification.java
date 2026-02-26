public class EmailNotification implements NotificationSystem{
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Sending EMAIL to " + recipient);
        System.out.println("Message: " + message);

        logNotification("Email", recipient);
    }
}
