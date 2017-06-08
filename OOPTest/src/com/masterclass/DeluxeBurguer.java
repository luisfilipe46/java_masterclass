package com.masterclass;

/**
 * Created by luis on 08-06-2017.
 */
public class DeluxeBurguer extends Hamburguer {
    public DeluxeBurguer() {
        super("Deluxe", "White",
                "Sausage & Bacon", 14.75);
        maxNumberAdditions = 2;
        addAddition("Chips", 2.75);
        addAddition("Drink", 1.81);
    }
}
