package com.collections.comparator;

import java.util.HashMap;
import java.util.TreeMap;

public class Main3 {

    public static void main(String[] args) {

        HashMap<String ,Integer> hm=new HashMap<>();
        hm.put("sugar",100);
        hm.put("ant",344);
        hm.put("zebra",55);
        hm.put("cakee",554);

        System.out.println(hm);
        System.out.println("-----------------------------------");

        //TreeMap automatically sorts the key only
        TreeMap<String ,Integer> tm=new TreeMap<>();
        tm.put("sugar",100);
        tm.put("ant",344);
        tm.put("zebra",55);
        tm.put("cakee",554);

        System.out.println(tm);

    }
}
