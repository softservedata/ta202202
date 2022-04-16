package com.softserve.edu.hw6;

class Pub {
    public static void main(String[] args) {
        Pub easternPub = new Pub(Drinks.COFFEE, 30);
        Pub southernPub = new Pub(Drinks.COFFEE, 35);
        Pub westernPub = new Pub(Drinks.WATER, 10);
        Pub northernPub = new Pub(Drinks.WINE, 100);
        Pub centralPub = new Pub(Drinks.WATER, 10);
        Pub[] pubList = new Pub[]{easternPub, southernPub, westernPub, northernPub, centralPub};
        for (int i = 0; i < pubList.length - 1; i++) {
            for (int j = i + 1; j < pubList.length; j++) {
                if (pubList[i].equals(pubList[j])) {
                    System.out.println("Pub #" + (i + 1) + " has the same menu as pub #" + (j + 1));
                }
            }
        }
    }

    private String drinkType;
    private int price;

    public int getPrice() {
        return price;
    }

    public String getDrinkType() {
        return drinkType;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDrinkType(String drinkType) {
        this.drinkType = drinkType;
    }

    public Pub(Drinks drink, int price) {
        this.drinkType = drink.getDescription();
        this.price = price;
    }

    @Override
    public String toString() {
        return "Type of drink: " + drinkType + ", Price: " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pub pub = (Pub) o;
        return getPrice() == pub.getPrice() && getDrinkType().equals(pub.getDrinkType());
    }

}


enum Drinks {
    WATER("Mineral water"),
    COFFEE("Coffee, Arabica 100%"),
    WINE("Red wine, semi-dry");
    private final String description;

    Drinks(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}