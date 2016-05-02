package com.company;

import com.company.FileDirectory.File;
import com.company.FlowerShop.Flower;
import com.company.MusicShop.MusicInstrument;

import java.util.List;

public class Printer {

     private static String getName(Object param){
        String choose = param.getClass().getName().replaceAll("com.company.","");
        choose = choose.substring(0,choose.indexOf("."));
        switch(choose){
            case "FileDirectory":
                return ((File)param).getName();
            case "FlowerShop":
                return ((Flower)param).getName();
             case "MusicShop":
                return ((MusicInstrument)param).getName();
        }
        return "";
    }

    private static String getAdditional(Object param){
        String choose = param.getClass().getName().replaceAll("com.company.","");
        choose = choose.substring(0,choose.indexOf("."));
        switch(choose){
            case "FileDirectory":
            return ((File) param).getExtension();
        }
        return "";
    }


    public static void printClass(List<Object> paramList) {
        int counter = 1;

        System.out.println("+---+------------+---+");
        System.out.println("+ # +Name        +ext+");
        System.out.println("+---+------------+---+");
        for (Object Item : paramList) {
            System.out.printf("!%3d!%12s!%3s!\n",counter++, getName(Item),getAdditional(Item));
        }
        System.out.println("+---+------------+---+");
    }
}
