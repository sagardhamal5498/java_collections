package com.collections.durgesh_practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Map2 {

    public static void main(String[] args) {

        HashMap<String ,Integer> hm=new HashMap<>();
        hm.put("sugar",100);
        hm.put("ant",344);
        hm.put("zebra",55);
        hm.put("cakee",554);
        hm.put(null,null);
        hm.put(null,null);

        System.out.println(hm);
        System.out.println("-----------------------------------");

        //insertion order maintained  //slower than HM
        LinkedHashMap<String, Integer> lm = new LinkedHashMap<>();
        lm.put("sugar",100);
        lm.put("ant",344);
        lm.put("zebra",55);
        lm.put("cakee",554);
        lm.put(null, null);     //only one null allowed
        lm.put(null,null);
        System.out.println(lm);
        System.out.println("------------------------------------");

        //TreeMap automatically sorts the key only  //slower than both above
        TreeMap<String ,Integer> tm=new TreeMap<>();
        tm.put("sugar",100);
        tm.put("ant",344);
        tm.put("zebra",55);
        tm.put("cakee",554);
        tm.put("ant",455);      // as no duplicate is allowed
//        tm.put(null,null);    // no null allowed

        System.out.println(tm);

    }
}
