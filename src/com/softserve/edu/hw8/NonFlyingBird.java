package com.softserve.edu.hw8;

public abstract class NonFlyingBird implements Bird {
    @Override
    public boolean isFly() {
        return false;
    }
}
