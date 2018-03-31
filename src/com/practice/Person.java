package com.practice;

public class Person {

    private int age;
    private String lastName;
    private String firstName;

    public Person(String firstName, String lastName, int age ) {
        this.age = age;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


}
