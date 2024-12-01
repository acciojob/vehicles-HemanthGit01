package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);

        // Test move
        mercedes.move(40, 0);

        // Test accelerate
        mercedes.accelerate(20);
        mercedes.accelerate(-60);
    }
}
