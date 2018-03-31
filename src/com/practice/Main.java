package com.practice;

public class Main {

    public static void main(String[] args) {
        MotorcycleBike b = new MotorcycleBike();

        b.setMotorType("Harley");

        System.out.println(b.getGear());
        System.out.println(b.getMotorType());
        System.out.println(b.getSlogan());


        boolean equals = 1 == 2;
        System.out.println(equals);

    }
}
