package com.masterclass;

public class Main {

    public static void main(String[] args) {
        Hamburguer hamburguer = new Hamburguer("Basic",
                "Sausage", "White", 3.56);
        System.out.println(hamburguer.getTotalPrice());

        hamburguer.addAddition("tomato", 0.27);
        hamburguer.addAddition("lettuce", 0.75);
        hamburguer.addAddition("cheese", 1.13);

        System.out.println(hamburguer.getTotalPrice());

        HealthyBurguer healthyBurguer = new HealthyBurguer(
                "Bacon", 5.67);
        System.out.println(healthyBurguer.getTotalPrice());
        healthyBurguer.addAddition("Egg", 5.43);
        healthyBurguer.addAddition("Lentils",
                3.41);
        System.out.println(healthyBurguer.getTotalPrice());

        DeluxeBurguer db = new DeluxeBurguer();
        System.out.println(db.getTotalPrice());
        db.addAddition("test", 1);
        System.out.println(db.getTotalPrice());
    }
}
