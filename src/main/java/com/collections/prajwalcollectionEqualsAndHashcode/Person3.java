package com.collections.prajwalcollectionEqualsAndHashcode;

import java.util.Objects;

public class Person3 {

    String name;
    int age;

    Person3(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (obj == null || getClass() != obj.getClass()) return false;
//        Person3 person = (Person3) obj;
//        return age == person.age && name.equals(person.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }

    @Override
    public String toString() {
        return "Person3{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
