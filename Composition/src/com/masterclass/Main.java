package com.masterclass;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20,
                5);
        Case theCase = new Case("220B", "Dell",
                "240", dimensions);

        Monitor monitor = new Monitor("27inch Beast",
                "Acer", 27,
                new Resolution(2540, 1440));

        Motherboard motherboard = new Motherboard("BJ-200",
                "Asus", 4, 6, "v2.44");

        PC pc = new PC(theCase, motherboard, monitor);
        pc.powerUp();


        Window window = new Window(dimensions);
        Door door = new Door(false, dimensions);
        Bed bedroom = new Bed(dimensions);
        List<Cloth> clothes = new ArrayList<Cloth>() {{
            add(new Cloth("red" , "jeans"));
            add(new Cloth("blue", "t-shirt"));
        }};
        Dresser dresser = new Dresser(clothes);
        Room room = new Room(window, door, bedroom, dresser);
        room.enter();
        room.getDresser().getCloth(0);
        room.exit();

    }
}
