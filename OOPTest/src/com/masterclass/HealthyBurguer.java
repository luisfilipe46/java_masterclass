package com.masterclass;

import java.util.ArrayList;
import java.util.List;

public class HealthyBurguer extends Hamburguer {
    private List<Addition> healthyAdditions = new ArrayList<>();

    public HealthyBurguer(String meat, double price) {
        super("Healthy", "Brown rye", meat, price);
        this.maxNumberAdditions = 6;
    }

    /*
    public synchronized boolean addHealthyAddition(
            String healthyAddition, double priceAddition) {
        if (healthyAdditions.size() >= 2)
            return false;

        healthyAdditions.add(new Addition(healthyAddition,
                priceAddition));
        totalPrice += priceAddition;
        return true;
    }
    */
}
