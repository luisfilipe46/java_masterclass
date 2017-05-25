package com.masterclass;

/**
 * Created by luis on 25-05-2017.
 */
public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account() {
        this("56789", 2.50, "Default name",
                "Default address", "default phne");
        System.out.println("Empty constructor called");
    }

    public Account(String number, double balance, String customerName,
                   String email, String phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Account(String customerName, String email, String phoneNumber) {
        this("99999", 100.55, customerName, email,
                phoneNumber);
    }

    public void deposit(double value) {
        balance += value;
        System.out.println("Deposit of " + value + " made. New balance is " +
                balance);
    }

    public boolean withdraw(double value) {
        if (balance >= value) {
            balance -= value;
            System.out.println("Withdrawal of " + value + " processed. " +
                    "Remaining balance = " + balance);
            return true;
        }

        System.out.println("Only " + balance + " available. Withdrawal not" +
                "processed");
        return false;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
