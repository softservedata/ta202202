package com.softserve.edu.hw8;

public class Penguin extends NonFlyingBird {

    @Override
    public String getName() {
        return "Penguin";
    }

    @Override
    public String toString() {
        String desc;
        if (this.isFly()) {
            desc = "a flying bird";
        }
        else {
            desc = "not a flying bird";
        }
        return this.getName() + " is " + desc;

    }

    @Override
    public int compareTo(Bird o) {
        return this.getName().compareTo(o.getName());
    }
}
