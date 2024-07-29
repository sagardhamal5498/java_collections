package com.collections.prajwalcollection;

import java.util.HashMap;
import java.util.Map;

public class Main2 {

    public static void main(String[] args) {
        Person2 person1 = new Person2("Alice", 30);
        Person2 person2 = new Person2("Alice", 30);

        Map<Person2, String> map = new HashMap<>();
        map.put(person1, "Alice's data");

// Trying to retrieve using an equivalent key
        String data = map.get(person2); // This will return "Alice's data"
        System.out.println(data);
    }
}
