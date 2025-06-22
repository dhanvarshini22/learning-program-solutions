public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        // Adding products
        manager.addProduct(new Product("P001", "Monitor", 10, 8999.99));
        manager.addProduct(new Product("P002", "Keyboard", 25, 1299.50));

        // Updating product
        manager.updateProduct("P001", 8, 8500.00);

        // Deleting product
        manager.deleteProduct("P002");

        // Display inventory
        manager.viewInventory();
    }
}
