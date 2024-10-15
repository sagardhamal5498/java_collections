package com.collections.prajwalcollectionEqualsAndHashcode;

public class Person {

    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // hashCode is not overridden
    // equals is not overridden
}
