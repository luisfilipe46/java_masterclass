package com.masterclass;

/**
 * Created by luis on 27-05-2017.
 */
public class Vehicle {

    private int size;

    private double speed = 0.0;
    private double direction = 0.0;

    public Vehicle(int size) {
        this.size = size;
    }

    public void steer(double direction) {
        System.out.println("Steering vehicle: +" + direction + "degrees");
        this.direction += direction;
    }

    public void accelerate(double speed) {
        System.out.println("Accelerating vehicle: " + speed + "km/h");
        this.speed += speed;
    }

    public void decelerate(double speed) {
        System.out.println("Decelerating vehicle: " + speed + "km/h");
        this.speed -= speed;
    }

    public void stop() {
        speed = 0.0;
    }
}
