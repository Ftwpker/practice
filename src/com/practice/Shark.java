package com.practice;

public class Shark implements FishInterface{
    private String fishType;
    private int fishSpeed;
    public void setFishType(String type) {
        fishType = type;
    }

    public String getFishType() {
        return fishType;
    }


    public int calcFishSpeed(int speed) {
        fishSpeed = speed * fishBaseSpeed;
        return fishSpeed;
    }
}
