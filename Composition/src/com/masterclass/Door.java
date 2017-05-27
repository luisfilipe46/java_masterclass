package com.masterclass;

/**
 * Created by luis on 27-05-2017.
 */
public class Door {
    private boolean opened;
    private Dimensions dimensions;

    public Door(boolean opened, Dimensions dimensions) {
        this.opened = opened;
        this.dimensions = dimensions;
    }

    public void open() {
        opened = true;
    }

    public void close() {
        opened = false;
    }
}
