package com.company.FlowerShop;

import java.util.ArrayList;
import java.util.List;

class Rosebush {
    private List<Rose> roses = new ArrayList<>();

    Rosebush() {
        this.roses.add(new Rose());
    }

    Rosebush(Rose rose) {
        this.roses.add(rose);
    }

    Rosebush(List<Rose> roses) {
        this.roses = roses;
    }

    public List<Rose> getRoses() {
        return this.roses;
    }

    public void addRose(Rose rose) {
        this.roses.add(rose);
    }
}
