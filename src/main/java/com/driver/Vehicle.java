package com.driver;

public class Vehicle {

    private String name;
    private int currentSpeed;
    private int currentDirection;

    public Vehicle(String name) {
        this.name = name;
        this.currentSpeed = 0; // Initial speed
        this.currentDirection = 0; // Initial direction
    }

    public void steer(int direction) {
        this.currentDirection += direction; // Update direction
        System.out.println("steer method called - The direction is changed to: " + currentDirection + " degrees");
    }

    public void move(int speed, int direction) {
        this.currentSpeed = speed;
        this.currentDirection = direction;
        System.out.println("move method called - The speed is changed to: " + currentSpeed + ", and the direction is changed to: " + currentDirection + " degrees");
    }

    public void stop() {
        this.currentSpeed = 0; // Stop the vehicle
        System.out.println("stop method called - The vehicle is stopped");
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}