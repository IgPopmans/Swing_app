package com;

public class Car extends Transport {
    int maxPassengers;

    public Car(int fuel, int speed, int maxPassengers) {
        super(fuel, speed);
        this.maxPassengers = maxPassengers;
    }

    @Override
    public boolean canMoveIt(int n) {
        if (fuel >= n) {
            fuel -= n;
            return true;
        } else return false;

    }

    @Override
    public int getFuelLevel() {
        return fuel;
    }

    public int getMaXPassengers() {
        return maxPassengers;
    }
}
