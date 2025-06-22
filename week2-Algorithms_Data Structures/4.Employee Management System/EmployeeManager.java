public class EmployeeManager {
    private Employee[] employees;
    private int count;

    public EmployeeManager(int capacity) {
        employees = new Employee[capacity];
        count = 0;
    }

    // Add employee
    public void addEmployee(Employee e) {
        if (count < employees.length) {
            employees[count++] = e;
        } else {
            System.out.println("❌ Array is full. Cannot add more employees.");
        }
    }

    // Search by ID
    public Employee searchEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                return employees[i];
            }
        }
        return null;
    }

    // Delete by ID
    public void deleteEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                // Shift left
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null;
                System.out.println("✅ Employee deleted.");
                return;
            }
        }
        System.out.println("❌ Employee not found.");
    }

    // Traverse and print all employees
    public void listEmployees() {
        System.out.println("📋 Employee List:");
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }
}
