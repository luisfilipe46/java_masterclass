package com.masterclass;

public class Printer {

    private int numberOfPagesPrinted = 0;
    private boolean duplexPrinter;
    private int tonerLevel;

    public Printer(boolean duplexPrinter, int tonerLevel) {
        this.duplexPrinter = duplexPrinter;
        this.tonerLevel = tonerLevel;

        if (this.tonerLevel > 100)
            this.tonerLevel = 100;
        if (this.tonerLevel < 0)
            this.tonerLevel = 0;
    }

    public void fillToner() {
        tonerLevel = 100;
    }

    public int fillToner(int increase) {
        int finalTonerLevel = tonerLevel + increase;
        if (finalTonerLevel > 100 || finalTonerLevel < 0)
            return -1;
        tonerLevel += increase;
        return tonerLevel;
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;

        if (duplexPrinter)
            pagesToPrint = pagesToPrint / 2;

        numberOfPagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }
}
