package com.masterclass;


public class Peugeot308 extends Car {
    public Peugeot308() {
        super("Peugeot 308", 4);
    }

    public void startEngine() {
        System.out.println("Peugeot 308 bruuuuuuurrrum - Starting " +
                "engine");
    }

    public void accelerate() {
        System.out.println("Peugeot 308 bruuuuuuurrrum - " +
                "Accelerating");
    }

    public void brake() {
        System.out.println("Peugeot 308 bruuuuuuurrrum - " +
                "Braking");
    }
}
