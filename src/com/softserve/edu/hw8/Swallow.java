package com.softserve.edu.hw8;

public class Swallow extends FlyingBird {


    @Override
    public String getName() {
        return "Swallow";
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
