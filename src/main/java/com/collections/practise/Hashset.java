package com.collections.practise;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Hashset {



    public static void main(String[] args) {

        Set<Integer> set=new HashSet<>();    //does not mainatains insertion order

        set.add(89);
        set.add(11);
        set.add(15);
        set.add(50);
        set.add(88);

        System.out.println(set);

        Set<Integer> set1=new LinkedHashSet<Integer>();   //mainatains insertion order

        set1.add(89);
        set1.add(11);
        set1.add(15);
        set1.add(50);

        System.out.println(set1);

        Set<Integer> set2=new TreeSet<Integer>();
        set2.add(89);
        set2.add(11);
        set2.add(15);
        set2.add(50);

        System.out.println(set2);


        Set set3=new HashSet<>();
        set3.add(89);
        set3.add(11);
        set3.add(15);
        set3.add("jio");

        System.out.println(set3);
    }
}
