package com.masterclass;

/**
 * Created by luis on 27-05-2017.
 */
public class Player {

    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health -= damage;

        if (this.health <= 0)
            System.out.println("Player knocked out");
    }

    public int healthRemaining() {
        return health;
    }
}
