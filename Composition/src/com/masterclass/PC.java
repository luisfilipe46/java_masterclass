package com.masterclass;

/**
 * Created by luis on 27-05-2017.
 */
public class PC {

    private Case theCase;
    private Motherboard motherboard;
    private Monitor monitor;

    public PC(Case theCase, Motherboard motherboard, Monitor monitor) {
        this.theCase = theCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    public void drawLogo() {
        // Fancy graphics
        monitor.drawPosition(1200, 50, "yellow");
    }
}
