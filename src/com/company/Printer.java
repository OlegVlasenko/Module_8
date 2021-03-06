package com.company;

import com.company.FileDirectory.File;
import com.company.FileDirectory.Jpeg;
import com.company.FileDirectory.Mp3;
import com.company.FileDirectory.Txt;
import com.company.FlowerShop.*;
import com.company.MusicShop.Guitar;
import com.company.MusicShop.MusicInstrument;
import com.company.MusicShop.Piano;
import com.company.MusicShop.Trumpet;

import java.util.ArrayList;
import java.util.List;

class Printer {

    //identifying class of object using 'instanceof'
    private static String getName2(Object param) {
        if (param instanceof Flower) return ((Flower) param).getName();
        else if (param instanceof File) return ((File) param).getName();
        else if (param instanceof MusicInstrument) return ((MusicInstrument) param).getName();
        return "";
    }

    //identifying class of object using 'getClass().getName()'
    private static String getName(Object param) {
        String choose = param.getClass().getName().replaceAll("com.company.", "");
        choose = choose.substring(0, choose.indexOf("."));
        switch (choose) {
            case "FileDirectory":
                return ((File) param).getName();
            case "FlowerShop":
                return ((Flower) param).getName();
            case "MusicShop":
                return ((MusicInstrument) param).getName();
        }
        return "";
    }

    private static String getAdditional(Object param) {
        String choose = param.getClass().getName().replaceAll("com.company.", "");
        choose = choose.substring(0, choose.indexOf("."));
        switch (choose) {
            case "FileDirectory":
                return ((File) param).getExtension();
        }
        return "";
    }

    public static void printClass(List<Object> paramList) {
        int counter = 1;

        System.out.println("+---+------------+---+------------+");
        System.out.println("+ # +Name        +ext+ HashCode() !");
        System.out.println("+---+------------+---+------------+");
        for (Object Item : paramList) {
            System.out.printf("!%3d!%12s!%3s!%11s !\n", counter++, getName(Item), getAdditional(Item), Item.getClass().hashCode());
        }
        System.out.println("+---+------------+---+------------!");
    }

    static void sort(ArrayList<Object> paramArray) {

        boolean needSort;
        Object temp;

        do {
            needSort = false;
            for (int i = 0; i < paramArray.size() - 1; i++) {
                if (getName2(paramArray.get(i)).compareToIgnoreCase((getName2(paramArray.get(i + 1)))) > 0) {
                    temp = paramArray.get(i);
                    paramArray.set(i, paramArray.get(i + 1));
                    paramArray.set(i + 1, temp);
                    needSort = true;
                }
            }
        } while (needSort);
    }

    static void initArrayRandom(ArrayList<Object> Gifts, int count) {
        for (int i = 0; i < count; i++) {

            int choose = new java.util.Random().nextInt(10);
            switch (choose) {
                case 0:
                    Gifts.add(new Jpeg("Name" + (int) (Math.random() * 10)));
                    break;
                case 1:
                    Gifts.add(new Mp3("Name" + (int) (Math.random() * 10)));
                    break;
                case 2:
                    Gifts.add(new Txt("Name" + (int) (Math.random() * 10)));
                    break;
                case 3:
                    Gifts.add(new Aster());
                    break;
                case 4:
                    Gifts.add(new Chamomile());
                    break;
                case 5:
                    Gifts.add(new Rose());
                    break;
                case 6:
                    Gifts.add(new Tulip());
                    break;
                case 7:
                    Gifts.add(new Guitar());
                    break;
                case 8:
                    Gifts.add(new Piano());
                    break;
                case 9:
                    Gifts.add(new Trumpet());
                    break;
                default:
                    System.out.println("cant find " + choose);
            }
        }

    }
}
