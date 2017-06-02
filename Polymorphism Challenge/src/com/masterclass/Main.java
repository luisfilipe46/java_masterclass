package com.masterclass;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Base", 10);
        car.startEngine();
        car.accelerate();
        car.brake();

        FiatTipo tipo = new FiatTipo();
        tipo.startEngine();
        tipo.accelerate();
        tipo.brake();

        Mazda3 mazda = new Mazda3();
        mazda.startEngine();
        mazda.accelerate();
        mazda.brake();

        Peugeot308 peugeot = new Peugeot308();
        peugeot.startEngine();
        peugeot.accelerate();
        peugeot.brake();

    }
}
