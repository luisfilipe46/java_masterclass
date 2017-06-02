package com.masterclass;

public class Car {
    private int numberOfCilindres;
    private boolean engine;
    private int wheels;
    private String name;

    public Car(String name, int numberOfCilindres) {
        this.name = name;
        this.numberOfCilindres = numberOfCilindres;
        engine = true;
        wheels = 4;
    }

    public int getNumberOfCilindres() {
        return numberOfCilindres;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }

    public void startEngine() {
        System.out.println("Starting engine");
    }

    public void accelerate() {
        System.out.println("Accelerating");
    }

    public void brake() {
        System.out.println("Braking");
    }
}
