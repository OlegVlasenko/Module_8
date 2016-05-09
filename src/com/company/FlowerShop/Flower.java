package com.company.FlowerShop;

public class Flower {
    private final String name;

    Flower(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return name;
    }
}