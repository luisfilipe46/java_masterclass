import java.util.ArrayList;

public class Customer {
    private ArrayList<Double> transactions = new ArrayList<Double>();
    private String name;

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public String getName() {
        return name;
    }

    public boolean addTransaction(Double amount) {
        transactions.add(amount);
        return true;
    }

    public Customer(String name2, Double initialAmount) {
        name = name2;
        transactions.add(initialAmount);
    }
}
