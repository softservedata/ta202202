package com.softserve.edu.hw6;

import java.util.Objects;
import java.lang.String;

public class Pub {
    enum Drinks {
        WATER("Morshynska"),
        COFFE("Arabica 80%"),
        WINE("Kindzmarauli");

        private String description;

        private Drinks (String description){
            this.description = description;
        }

        @Override
        public String toString() {
            return  name();
        }

        public String getDescription() {
            return "description - " + description;
        }
    }

    private Drinks description;
    private Double price;

    public Pub(Drinks description, Double price) {
        this.description = description;
        this.price = price;
    }

    public Drinks getDrinkType() {
        return description;
    }

    public void setDrinkType(String drinkType) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pub pub = (Pub) o;
        return Objects.equals(description, pub.description) && Objects.equals(price, pub.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, price);
    }

    @Override
    public String toString() {
        return "{" +
                "drinkType='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
