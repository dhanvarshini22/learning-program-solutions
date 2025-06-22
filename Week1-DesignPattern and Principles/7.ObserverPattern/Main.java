public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        // Create observers
        Observer mobile1 = new MobileApp("Alice");
        Observer mobile2 = new MobileApp("Bob");
        Observer web1 = new WebApp("InvestorWeb");

        // Register observers
        stockMarket.registerObserver(mobile1);
        stockMarket.registerObserver(mobile2);
        stockMarket.registerObserver(web1);

        // Stock updates
        System.out.println("\n--- First Update ---");
        stockMarket.setStock("AAPL", 150.75);

        System.out.println("\n--- Second Update ---");
        stockMarket.setStock("GOOGL", 2745.60);

        // Deregister an observer
        stockMarket.removeObserver(mobile2);

        System.out.println("\n--- Third Update (After Bob is removed) ---");
        stockMarket.setStock("MSFT", 310.50);
    }
}
