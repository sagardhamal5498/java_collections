package com.collections.prajwalcollection;

import java.util.Objects;

public class Person2 {

    private final String name;
    private final int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person2 person = (Person2) obj;
        return age == person.age && Objects.equals(name, person.name);
    }
}
