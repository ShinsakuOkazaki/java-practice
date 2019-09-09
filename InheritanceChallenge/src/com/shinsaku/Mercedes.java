package com.shinsaku;

public class Mercedes extends Car {
    private String model;
    private double price;
    private int gieer;
    private int maxSpeed;

    public Mercedes(String size, String model, double price) {
        super(size, 4, false);
        this.model = model;
        this.price = price;
        this.gieer = 1;
    }

    public void drive(int velocity, int direction) {
        if(this.maxSpeed >= getCurrentVelocity() + velocity) {
            super.drive(velocity, direction);
        } else {
            System.out.println("Change gieer");
        }
    }

    public void changeGieer(int gieer) {
        this.gieer = gieer;
        if(this.gieer == 1) {
            this.maxSpeed = 50;
        }
        else if(this.gieer == 2) {
            this.maxSpeed = 100;
        } else {
            this.maxSpeed = 300;
        }
        System.out.println("Gieer is changed to " + this.gieer);
        System.out.println("Max speed is " + this.maxSpeed);
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
}
