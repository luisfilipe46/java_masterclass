import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Bank {
    ArrayList<Branch> branches = new ArrayList<Branch>();
    String name;

    public Bank(String name) {
        this.name = name;
    }

    private Optional<Branch> findBranch(String branchName) {
        return branches
                .stream()
                .filter(b -> branchName.equals(b.getName()))
                .findFirst();
    }

    public boolean addNewBranch(String branchName) {
        if (!findBranch(branchName).isPresent()) {
            branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, Double initialAmount) {
        Optional<Branch> branchOptional = findBranch(branchName);

        if (branchOptional.isPresent()) {
            return branchOptional.get().addCustomer(customerName, initialAmount.doubleValue());
        }
        return false;
    }

    public boolean addTransaction(String branchName, String customerName, Double amount) {
        Optional<Branch> branchOptional = findBranch(branchName);

        if (branchOptional.isPresent()) {
            return branchOptional.get().addTransaction(customerName, amount.doubleValue());
        }
        return false;
    }

    public List<Customer> getCustomers(String branchName) {
        Optional<Branch> branchOptional = findBranch(branchName);

        if (branchOptional.isPresent()) {
            return branchOptional.get().getCustomers();
        }
        return null;
    }

    public List<Double> getTransactions(String branchName) {
        List<Customer> customerList = getCustomers(branchName);
        if (customerList != null)
            customerList
                    .stream()
                    .flatMap(customer -> customer.getTransactions().stream())
                    .collect(Collectors.toList());

        return null;
    }

    public void listCustomers(String branchName) {
        getCustomers(branchName).forEach(c -> System.out.println(c.getName()));
    }

    public void listTransactions(String branchName) {
        getCustomers(branchName).stream()
                .flatMap(customer -> {
                    System.out.println("Starting to analyze customer "+customer.getName());
                    return customer.getTransactions().stream();
                })
                .forEachOrdered(d -> System.out.println("Transaction with value: " + d));
    }

    public static void main(String[] args) {
        Bank cgd = new Bank("CAIXA");
        cgd.addNewBranch("VDA");
        cgd.addCustomer("VDA", "LA", 1.0);
        cgd.addCustomer("VDA", "CA", 2.0);
        cgd.addCustomer("VDA", "DA", 3.0);
        cgd.addCustomer("VDA", "HS", 4.0);

        cgd.addTransaction("VDA", "LA", 5.0);
        cgd.addTransaction("VDA", "CA", 6.0);
        cgd.addTransaction("VDA", "DA", 7.0);
        cgd.addTransaction("VDA", "HS", 8.0);

        cgd.listCustomers("VDA");
        cgd.listTransactions("VDA");
    }
}