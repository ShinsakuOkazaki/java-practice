package com.practice;

public class Main {

    public static void main(String[] args) {
        Car porsch = new Car();
        Car holden = new Car();
        System.out.println("Model is " + porsch.getModel());
        porsch.setModel("Carrera");
        System.out.println("Model is " + porsch.getModel());
    }
}
