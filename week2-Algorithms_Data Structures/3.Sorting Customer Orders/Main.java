public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("O001", "Alice", 1200.50),
            new Order("O002", "Bob", 599.99),
            new Order("O003", "Charlie", 4300.00),
            new Order("O004", "Diana", 850.75)
        };

        // Bubble Sort
        System.out.println("🔵 Sorted by Bubble Sort:");
        OrderSorter.bubbleSort(orders);
        OrderSorter.printOrders(orders);

        // New set for Quick Sort
        Order[] orders2 = {
            new Order("O001", "Alice", 1200.50),
            new Order("O002", "Bob", 599.99),
            new Order("O003", "Charlie", 4300.00),
            new Order("O004", "Diana", 850.75)
        };

        System.out.println("\n⚡ Sorted by Quick Sort:");
        OrderSorter.quickSort(orders2, 0, orders2.length - 1);
        OrderSorter.printOrders(orders2);
    }
}
