package com.softserve.edu.hw8;

public class Penguin extends NonFlyingBird{
    private final String name;

    public Penguin(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public int compareTo(Bird o) {
        return name.compareTo(o.getName());
    }

    public String toString() {
        return "\nName: " + getName() + ", " + "can fly: " + isFly();
    }
}
