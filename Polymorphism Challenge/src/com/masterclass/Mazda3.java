package com.masterclass;

public class Mazda3 extends Car{
    public Mazda3() {
        super("Mazda 3", 4);
    }

    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " " +
                "bruuuuuuurrrum - Starting engine");
    }

    public void accelerate() {
        System.out.println(getClass().getSimpleName() +
                "bruuuuuuurrrum - Accelerating");
    }

    public void brake() {
        System.out.println(getClass().getSimpleName() +
                "bruuuuuuurrrum - Braking");
    }
}
