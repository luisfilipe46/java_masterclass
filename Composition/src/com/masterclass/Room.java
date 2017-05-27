package com.masterclass;

/**
 * Created by luis on 27-05-2017.
 */
public class Room {

    private Window window;
    private Door door;
    private Bed bedroom;
    private Dresser dresser;

    public Room(Window window, Door door, Bed bedroom, Dresser dresser) {
        this.window = window;
        this.door = door;
        this.bedroom = bedroom;
        this.dresser = dresser;
    }

    public void enter() {
        door.open();
    }

    public void exit() {
        door.close();
    }

    public Dresser getDresser() {
        return dresser;
    }
}
