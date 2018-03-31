package com.practice;

public class referenceValue {

    public static void main(String[] args) {
       Bike b = new Bike();
       setBike(b);
       System.out.println(b.getCadence());

    }

    public static void setBike (Bike b) {
        b.setCadence(2);
    }
}
