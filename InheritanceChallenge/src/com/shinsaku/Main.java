package com.shinsaku;

public class Main {

    public static void main(String[] args) {
        Mercedes mercedes = new Mercedes("mediam", "open21", 300);
        mercedes.drive(100, 10);
        mercedes.changeGieer(3);
        mercedes.drive(100, 10);
    }
}
