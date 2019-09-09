package com.shinsaku;

public class Car extends Vehicle{
    private int wheels;
    private boolean roof;


    public Car(String size, int wheels, boolean roof) {
        super("car", size);
        this.wheels = wheels;
        this.roof = roof;
    }

    public void drive(int velocity, int direction) {
        super.move(velocity);
        super.changeDirection(direction);
        System.out.println("Moving at velocity: " + getCurrentVelocity() + " at direction: " + getCurrentDirection());
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isRoof() {
        return roof;
    }
}
