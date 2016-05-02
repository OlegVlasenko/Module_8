package com.company;

import com.company.FileDirectory.Jpeg;
import com.company.FileDirectory.Mp3;
import com.company.FileDirectory.Txt;
import com.company.FlowerShop.Aster;
import com.company.FlowerShop.Charmomile;
import com.company.FlowerShop.Rose;
import com.company.FlowerShop.Tulip;
import com.company.MusicShop.Guitar;
import com.company.MusicShop.Piano;
import com.company.MusicShop.Trumpet;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Object> Gifts = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            int choose = (int)(Math.random()*10);
            switch (choose){
                case 0:
                    Gifts.add(new Jpeg("Name"+(int)(Math.random()*10)));
                    break;
                case 1:
                    Gifts.add(new Mp3("Name"+(int)(Math.random()*10)));
                    break;
                case 2:
                    Gifts.add(new Txt("Name"+(int)(Math.random()*10)));
                    break;
                case 3:
                    Gifts.add(new Aster());
                    break;
                case 4:
                    Gifts.add(new Charmomile());
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

        for (Object Item: Gifts ) System.out.println("Obj : " + Item);

        Printer.printClass(Gifts);

    }
}
