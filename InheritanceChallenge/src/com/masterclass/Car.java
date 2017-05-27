package com.masterclass;

/**
 * Created by luis on 27-05-2017.
 */
public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private int gears;
    private int currentGear;
    private boolean isManual;

    public Car(int wheels, int size, int doors, int gears, boolean isManual) {
        super(size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.currentGear = 0;
        this.isManual = isManual;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car current gear changed to " + this.currentGear + " gear");
    }

    @Override
    public void accelerate(double speed) {
        if (!isManual)
            changeGear((int) (speed / 10));

        super.accelerate(speed);
    }

    @Override
    public void decelerate(double speed) {
        if (!isManual)
            changeGear((int) (speed / 10));

        super.decelerate(speed);
    }


}
