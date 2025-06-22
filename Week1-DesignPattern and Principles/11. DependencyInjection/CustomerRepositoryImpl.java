import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<Integer, Customer> customers = new HashMap<>();

    public CustomerRepositoryImpl() {
        // Dummy data
        customers.put(1, new Customer(1, "Alice"));
        customers.put(2, new Customer(2, "Bob"));
    }

    @Override
    public Customer findCustomerById(int id) {
        return customers.get(id);
    }
}
