package com.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonTest {


    public static void main(String[] args) {

        List<Person>  people = Arrays.asList(
                new Person("Jimmy", "Kang", 20),
                new Person("Tom", "Dong", 20),
                new Person("Moon", "Sand", 20)
        );

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
        }
        });


        printAll(people);


    }

    public static void printAll(List<Person> people) {
        for (Person p : people) {
            System.out.println(p.getLastName());
        }
    }
 }
