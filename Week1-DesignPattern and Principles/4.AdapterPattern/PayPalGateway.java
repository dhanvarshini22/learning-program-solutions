public class PayPalGateway {
    public void makePayment(String currency, double amount) {
        System.out.println("Paid " + amount + " " + currency + " using PayPal.");
    }
}
