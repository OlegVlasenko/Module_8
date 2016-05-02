package com.company.FlowerShop;

import com.company.FlowerShop.Rose;

import java.util.ArrayList;
import java.util.List;

public class Rosebush {
    private List<Rose> roses;

    Rosebush () {
        this.roses = new ArrayList<>();
        this.roses.add(new Rose());
    }

    Rosebush (Rose rose) {
        this.roses = new ArrayList<>();
        this.roses.add(rose);
    }

    Rosebush (List<Rose> roses) {
        this.roses = new ArrayList<>();
        this.roses = roses;
    }

    public List<Rose> getRoses() {
        return this.roses;
    }

    public void addRose(Rose rose){
        this.roses.add(rose);
    }
}