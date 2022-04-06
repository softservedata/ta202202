package com.softserve.edu.hw6;

import com.softserve.edu.hw5.Drinks;

public class Pub {
    private String name;
    private Drinks drinkType;
    private Double price;

    public Pub(String name, Drinks drinkType, Double price) {
        this.name = name;
        this.drinkType = drinkType;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Drinks getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(Drinks drinkType) {
        this.drinkType = drinkType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\"" + name + "\"" +
                " serves " + drinkType.name().toLowerCase() +
                " just for " + price +
                "! " + drinkType.getDescription();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Pub pub = (Pub) object;
        return getDrinkType() == pub.getDrinkType() && getPrice().equals(pub.getPrice());
    }
}
