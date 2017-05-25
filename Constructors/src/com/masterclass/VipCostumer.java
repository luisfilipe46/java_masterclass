package com.masterclass;

/**
 * Created by luis on 26-05-2017.
 */
public class VipCostumer {

    private String name, email;
    private double creditLimit;

    public VipCostumer(String name, String email, double creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public VipCostumer() {
        this ("no one", "noone@email.com", 0);
    }

    public VipCostumer(String name, double creditLimit) {
        this(name, "unknown", creditLimit);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
