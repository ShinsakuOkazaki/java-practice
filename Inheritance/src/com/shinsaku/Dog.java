package com.shinsaku;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tails;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tails, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tails = tails;
        this.coat = coat;
    }
    private void chew() {
        System.out.println("chew method");
    }

    public void walk() {
        System.out.println("Dog walk");
        super.move();
        move();
    }

    @Override
    public void eat() {
        System.out.println("Dog.ear () called");
        chew();
        super.eat();
    }
}
