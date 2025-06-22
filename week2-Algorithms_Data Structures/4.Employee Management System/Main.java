public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        // Add employees
        manager.addEmployee(new Employee(101, "Alice", "Manager", 60000));
        manager.addEmployee(new Employee(102, "Bob", "Developer", 50000));
        manager.addEmployee(new Employee(103, "Charlie", "Designer", 45000));

        // List all
        manager.listEmployees();

        // Search
        System.out.println("\n🔍 Searching for ID 102:");
        Employee found = manager.searchEmployee(102);
        System.out.println(found != null ? found : "Not found");

        // Delete
        System.out.println("\n🗑️ Deleting ID 102:");
        manager.deleteEmployee(102);

        // List again
        manager.listEmployees();
    }
}
