public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pay using Credit Card
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456", "Alice"));
        context.processPayment(500.0);

        // Pay using PayPal
        context.setPaymentStrategy(new PayPalPayment("alice@example.com"));
        context.processPayment(300.0);
    }
}
