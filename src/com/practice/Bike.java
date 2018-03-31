package com.practice;

public class Bike {

    private int gear;
    private int cadence;
    private int speed;

    public Bike() {
        gear = 1;
        cadence = 0;
        speed = 0;
    }

    public Bike(int gear, int cadence, int speed) {
        this.gear = gear;
        this.cadence = cadence;
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public int getCadence() {
        return cadence;
    }

    public int getSpeed() {
        return speed;
    }

    public void setGear(int newGear) {
        gear = newGear;
    }

    public void setCadence(int newCadence) {
        cadence = newCadence;
    }

    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }

    public String getSlogan() {
        return "Bike Bike";
    }
}
