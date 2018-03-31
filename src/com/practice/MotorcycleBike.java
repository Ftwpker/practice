package com.practice;

public class MotorcycleBike extends Bike {
    private String MotorType;
    private String slogan;

    public void setMotorType(String type) {
        MotorType = type;
    }

    public String getMotorType() {
        return MotorType;
    }

    public String getSlogan() {
        super.getSlogan();
        return "Motorcycle Bike";
    }

}
