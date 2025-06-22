public class Product {
    String productId;
    String productName;
    int quantity;
    double price;

    public Product(String productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String toString() {
        return "Product ID: " + productId + ", Name: " + productName +
               ", Quantity: " + quantity + ", Price: ₹" + price;
    }
}
