package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Object> Gifts = new ArrayList<>();

        Printer.initArrayRandom(Gifts, 25);

        //for (Object Item: Gifts ) System.out.println("Obj : " + Item);

        System.out.println("Random ArrayList before sort :");
        //Задание 1
        Printer.printClass(Gifts);

        System.out.println("\nSame ArrayList after sort :");
        //Задание 2
        Printer.sort(Gifts);

        Printer.printClass(Gifts);

    }
}
