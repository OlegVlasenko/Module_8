package com.company;

import java.util.ArrayList;

class Main {

    public static void main(String[] args) {

        final int ARRAY_SIZE = 25;
        ArrayList<Object> Gifts = new ArrayList<>();

        Printer.initArrayRandom(Gifts, ARRAY_SIZE);
        System.out.println("Random ArrayList before sort :");

        //Задание 1
        Printer.printClass(Gifts);
        System.out.println("\nSame ArrayList after sort :");

        //Задание 2
        Printer.sort(Gifts);
        Printer.printClass(Gifts);

    }
}
