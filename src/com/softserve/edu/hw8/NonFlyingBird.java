package com.softserve.edu.hw8;

abstract class NonFlyingBird implements Bird {
    @Override
    public boolean isFly() {
        return false;
    }
}
