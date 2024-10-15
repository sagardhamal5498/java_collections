package com.collections.prajwalcollectionEqualsAndHashcode;

import java.util.HashSet;

public class Main3 {

    public static void main(String[] args) {

        HashSet<Person3> p3 = new HashSet<>();

        Person3 p1 = new Person3("prajwal", 22);
        Person3 p2 = new Person3("prajwal", 22);

        p3.add(p1);
        p3.add(p2);   //will add one only bcoz equals and hashcode

        System.out.println(p3);

    }
}
