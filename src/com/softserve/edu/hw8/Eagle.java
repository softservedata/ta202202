package com.softserve.edu.hw8;

public class Eagle extends FlyingBird{
    @Override
    public String getName () {
        return "Eagle";
    }

    @Override
    public int compareTo(Bird b) {
        int result = this.getName().compareTo(b.getName());
        return result;
    }

    @Override
    public String toString () {
        String birdInfo;
        if (this.isFly()) {
            birdInfo = "This is a flying bird.";
        }
        else {
            birdInfo = "This is not a flying bird.";
        }
        return "This is a(n) " + this.getName() + ". " + birdInfo;
    }
}
