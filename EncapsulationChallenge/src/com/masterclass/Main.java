package com.masterclass;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(false, 100);
        System.out.println("initial page count = " +
                printer.getNumberOfPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " +
                + pagesPrinted + " new total print count for printer " +
                printer.getNumberOfPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " +
                + pagesPrinted + " new total print count for printer " +
                printer.getNumberOfPagesPrinted());
    }
}
