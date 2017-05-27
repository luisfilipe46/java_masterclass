package com.masterclass;

/**
 * Created by luis on 27-05-2017.
 */
public class CityCar extends Car {

    private int minSizeToPark;

    public CityCar(int minSizeToPark, int wheels, int size, int gears) {
        super(wheels, size, 2, gears, true);
        this.minSizeToPark = minSizeToPark;
    }

    public void parkInSmallPlaces () {

    }
}
