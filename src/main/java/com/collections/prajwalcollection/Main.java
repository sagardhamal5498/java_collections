package com.collections.prajwalcollection;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Alice", 30);

        Map<Person, String> map = new HashMap<>();
        map.put(person1, "Alice's data");

        // Trying to retrieve using an equivalent key
        String data = map.get(person2); // This will return null because person2 is not found
        System.out.println(data);
    }
}
