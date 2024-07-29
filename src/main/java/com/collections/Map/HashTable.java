package com.collections.Map;

import java.util.HashMap;
import java.util.Map;

public class HashTable {


    public static void main(String[] args) {
        Map< Integer, String> map = new HashMap<>();

        map.put(2, "jock");
        map.put(5, "rock");
        map.put(1, "root");
        map.put(4, "sobers");

        System.out.println(map);


        System.out.println("keyset:- " +map.keySet());
        System.out.println("values:- " + map.values());

        System.out.println("get value of given key :-" + map.get(5));

        System.out.println(map.containsValue("root"));;

    }

}
