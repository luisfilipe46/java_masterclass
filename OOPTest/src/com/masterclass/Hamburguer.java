package com.masterclass;


import java.util.ArrayList;
import java.util.List;

public class Hamburguer {

    private String name;
    private String rollType;
    private String meat;
    private List<Addition> additions = new ArrayList<>();
    int maxNumberAdditions = 4;
    protected double totalPrice;
    protected double basePrice;

    public Hamburguer(String name, String rollType, String meat,
                      double price) {
        this.basePrice = price;
        this.totalPrice = price;
        this.rollType = rollType;
        this.meat = meat;
    }

    public synchronized boolean addAddition(String addition, double priceAddition)
    {
        if (additions.size() >= maxNumberAdditions)
            return false;

        additions.add(new Addition(addition, priceAddition));
        totalPrice += priceAddition;

        return true;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
