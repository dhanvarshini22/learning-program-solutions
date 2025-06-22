public class Main {
    public static void main(String[] args) {
        // Basic Email Notification
        Notifier notifier = new EmailNotifier();

        // Add SMS on top of Email
        notifier = new SMSNotifierDecorator(notifier);

        // Add Slack on top of SMS and Email
        notifier = new SlackNotifierDecorator(notifier);

        // Send message
        notifier.send("Server down! Immediate action required.");
    }
}
