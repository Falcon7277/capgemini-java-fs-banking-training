import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NotificationSystem service;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the channel via which you want to send notification: SMS/EMAIL/PUSH");
        String channel = sc.next();
        System.out.println("Enter the message you want to send: ");
        String message = sc.next();
        System.out.println("Enter the recipient address: phone number/email address/device identifier");
        String recipient = sc.next();

       NotificationFactory nf = new NotificationFactory();
       NotificationSystem notificationService = NotificationFactory.getService(channel);
       notificationService.sendNotification(message, recipient);
    }
}
