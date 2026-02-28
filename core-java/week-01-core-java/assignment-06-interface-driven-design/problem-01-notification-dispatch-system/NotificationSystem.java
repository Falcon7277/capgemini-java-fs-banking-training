public interface NotificationSystem {
    void sendNotification(String message, String recipient);

    default void logNotification(String channel, String recipient) {
        System.out.println(
                "[LOG] Notification sent via " + channel + " to " + recipient
        );
    }
}
