package com.softserve.edu.hw8;

public class Penguin extends NonFlyingBird {


    @Override
    public String getName() {
        return "Penguin";
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
