package com.masterclass;


public class FiatTipo extends Car {
    public FiatTipo() {
        super("Fiat Tipo", 4);
    }

    public void startEngine() {
        System.out.println("Fiat Tipo bruuuuuuurrrum - Starting engine");
    }

    public void accelerate() {
        System.out.println("Fiat Tipo bruuuuuuurrrum - Accelerating");
    }

    public void brake() {
        System.out.println("Fiat Tipo bruuuuuuurrrum - Braking");
    }
}
