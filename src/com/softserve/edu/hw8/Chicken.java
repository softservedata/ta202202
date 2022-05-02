package com.softserve.edu.hw8;

public class Chicken extends NonFlyingBird {


    @Override
    public String getName() {
        return "Chicken";
    }

    @Override
    public String toString() {
        return "\nbird " + getName() + ", flies - " + isFly();
    }

    @Override
    public int compareTo(Bird o) {
        return getName().compareTo(o.getName());
    }
}
