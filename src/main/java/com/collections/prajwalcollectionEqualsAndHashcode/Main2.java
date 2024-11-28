package com.collections.prajwalcollectionEqualsAndHashcode;

import java.util.HashMap;
import java.util.Map;

public class Main2 {

    public static void main(String[] args) {
        Person2 person1 = new Person2("Alice", 30);
        Person2 person2 = new Person2("Alice", 30);

        Map<Person2, String> map = new HashMap<>();
        map.put(person1, "Alice's data");
        map.put(person2, "Alicee's data");

        int size = map.size();   //size will be 1 here after adding 2 also bcoz hashmap will add one only
        System.out.println(size);

// Trying to retrieve using an equivalent key
        String data = map.get(person2); // This will return "Alice's data" bcoz objects are same here
        System.out.println(data);

//  ************************ bcoz of this only we override it ********************

        System.out.println("******************");
        System.out.println(person1.equals(person2));
        System.out.println(person1.hashCode()==person2.hashCode());

    }
}
