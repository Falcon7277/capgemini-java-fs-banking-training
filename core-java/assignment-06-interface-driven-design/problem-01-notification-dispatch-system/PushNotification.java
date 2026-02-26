public class PushNotification implements NotificationSystem{
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Sending PUSH notification to " + recipient);
        System.out.println("Message: " + message);

        logNotification("Push", recipient);
    }
}
