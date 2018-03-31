package com.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.locks.Condition;

public class PersonTestJava8 {


    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Jimmy", "Kang", 20),
                new Person("Tom", "Dong", 20),
                new Person("Moon", "Sand", 20)
        );


        //sort the list
//        Collections.sort(people, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getLastName().compareTo(o2.getLastName());
//        }
//        });

        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
        //prints all the values
        printAll(people);

        //Step 3 Create method that prints all pepople that have last name beginning with C
    }
    public static void printAll(List<Person> people) {
        for (Person p : people) {
            System.out.println(p.getLastName());
        }
    }
 }
