public class SMSNotification implements NotificationSystem{
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Sending SMS to " + recipient);
        System.out.println("Message: " + message);

        logNotification("SMS", recipient);
    }
}
