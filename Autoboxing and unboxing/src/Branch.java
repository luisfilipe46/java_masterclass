import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Branch {
    private ArrayList<Customer> customers = new ArrayList<Customer>();
    private String name;

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public String getName() {
        return name;
    }

    public Branch(String name) {
        this.name = name;
    }

    private Optional<Customer> findCustomer(String customerName) {
        return customers
                .stream()
                .filter(c -> customerName.equals(c.getName()))
                .findFirst();
    }

    public boolean addCustomer(String name, double initialAmount) {
        if (!findCustomer(name).isPresent()) {
            customers.add(new Customer(name, Double.valueOf(initialAmount)));
            return true;
        }
        return false;
    }

    public boolean addTransaction(String customerName, Double amount) {
        Optional<Customer> customerOptional = findCustomer(customerName);

        if (customerOptional.isPresent()) {
            return customerOptional.get().addTransaction(amount);
        }
        return false;
    }

}
