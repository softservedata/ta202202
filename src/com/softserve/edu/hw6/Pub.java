package com.softserve.edu.hw6;

import com.softserve.edu.hw5.Drinks;

public class Pub {
    private String pubName;
    private String drinkType;
    private int drinkPrice;

    public Pub (String pubName, String drinkType, int drinkPrice) {
        this.pubName = pubName;
        this.drinkType = drinkType;
        this.drinkPrice = drinkPrice;
    }

    public String getPubName () {
        return pubName.toString();
    }

    public void setPubName (String addName) {
        this.pubName = addName;
    }
    public String getDrinkType () {
        if (drinkType.equals(Drinks.COFFEE.toString())
                || drinkType.equals(Drinks.WINE.toString())
                || drinkType.equals(Drinks.WATER.toString())) {
            return drinkType.toString();
        }
        else return "Selected drink is not in the stock now. Please select another one.";
    }

    public void setDrinkType (String addDrinktype) {
        if (addDrinktype.equals(Drinks.COFFEE.toString())
                || addDrinktype.equals(Drinks.WINE.toString())
                || addDrinktype.equals(Drinks.WATER.toString())) {
            this.drinkType = addDrinktype;
        }
        else this.drinkType = "Please select another drink...";
    }

    public int getDrinkPrice () {
        return drinkPrice;
    }

    public void setDrinkPrice (int addPrice) {
        this.drinkPrice = addPrice;
    }
}
