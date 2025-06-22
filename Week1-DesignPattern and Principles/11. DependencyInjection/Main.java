public class Main {
    public static void main(String[] args) {
        // Create repository instance
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Inject repository into service
        CustomerService service = new CustomerService(repository);

        // Use service to get customer info
        System.out.println("\n--- Searching for Customer with ID 1 ---");
        service.getCustomerDetails(1);

        System.out.println("\n--- Searching for Customer with ID 3 ---");
        service.getCustomerDetails(3); // Not found
    }
}
