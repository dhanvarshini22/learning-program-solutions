public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("P001", "Keyboard", "Electronics"),
            new Product("P002", "Shoes", "Fashion"),
            new Product("P003", "Laptop", "Electronics"),
            new Product("P004", "Book", "Stationery")
        };

        System.out.println("🔍 Linear Search for 'Laptop':");
        Product result1 = SearchEngine.linearSearch(products, "Laptop");
        System.out.println(result1 != null ? result1 : "Not Found");

        System.out.println("\n🧾 Binary Search for 'Laptop':");
        SearchEngine.sortProducts(products); // Must sort before binary search
        Product result2 = SearchEngine.binarySearch(products, "Laptop");
        System.out.println(result2 != null ? result2 : "Not Found");
    }
}
