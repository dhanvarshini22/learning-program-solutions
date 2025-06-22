public class MobileApp implements Observer {
    private String name;

    public MobileApp(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("MobileApp [" + name + "]: " + stockName + " is now $" + price);
    }
}
