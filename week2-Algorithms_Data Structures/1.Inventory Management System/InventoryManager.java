import java.util.HashMap;

public class InventoryManager {
    private HashMap<String, Product> inventory = new HashMap<>();

    // Add a product
    public void addProduct(Product product) {
        inventory.put(product.productId, product);
        System.out.println("Product added: " + product.productName);
    }

    // Update product details
    public void updateProduct(String productId, int quantity, double price) {
        Product product = inventory.get(productId);
        if (product != null) {
            product.quantity = quantity;
            product.price = price;
            System.out.println("Product updated: " + product.productName);
        } else {
            System.out.println("Product not found!");
        }
    }

    // Delete a product
    public void deleteProduct(String productId) {
        if (inventory.containsKey(productId)) {
            inventory.remove(productId);
            System.out.println("Product deleted: " + productId);
        } else {
            System.out.println("Product not found!");
        }
    }

    // View inventory
    public void viewInventory() {
        System.out.println("\nInventory:");
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }
}
