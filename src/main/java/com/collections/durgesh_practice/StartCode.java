package com.collections.durgesh_practice;

//import util package[all classes]

import java.util.*;

public class StartCode {
    public static void main(String[] args) {
        System.out.println("Welcome to code java collection framework");

       /*
       creating collection

       1)Type Safe- same type of elements(objects) are added to collection


       2)Un Type safe- different types of elements can be added to collection

        */

        //Type safe collection
        ArrayList<String> names = new ArrayList<String>();
        names.add("Durgesh");
        names.add("Sitara");
        names.add("Roshni");
        names.add("Vandna");
        names.add("Vandna");
        System.out.println(names);

        //get
//        System.out.println(names.get(0));
//        System.out.println(names.get(1));


        //un type safe
//        LinkedList list = new LinkedList();
//        list.add("Sachin");
//        list.add(101);
//        list.add(625.5124);
//        list.add(true);
//        System.out.println(list);

        //remove
        names.remove("Roshni");

        System.out.println(names);

        //size

        System.out.println("SIZE = " + names.size());

        //check item is there or not
        // Type ka equals method call karta hai checking karne ke lie
        //Student
        System.out.println(names.contains("Durgesh Kumar"));

        //check for empy
        System.out.println(names.isEmpty());

        //setting value..
        //names.set(1,"Ram");
        names.add(1, "Ram");

        System.out.println(names);

        //remove all elements
//        names.clear();

        System.out.println(names);

        Vector<String> vector = new Vector<>();
        vector.addAll(names);

        System.out.println("VECTOR " + vector);

        System.out.println("_____________________________________");

        HashSet<Double> nms = new HashSet<>();
        nms.add(14.14);
        nms.add(34.12354);
        nms.add((2354.235));
        nms.add(99.3);
        nms.add(99.3);
        nms.add(5.3);
        System.out.println(nms);

        TreeSet<Double> tset = new TreeSet<>();
        tset.addAll(nms);
        System.out.println(tset);


    }
}
