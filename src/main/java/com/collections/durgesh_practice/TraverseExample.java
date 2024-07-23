package com.collections.durgesh_practice;

import java.util.*;
import java.util.function.Consumer;

public class TraverseExample {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();
        names.add("Durgesh");
        names.add("Sitara");
        names.add("Roshni");
        names.add("Vandna");
        names.add("Vandna");
        names.add("ABC");

        //for each loop:
        for(String str:names)
        {
            System.out.print(str +"\t"+str.length()+"\t");
            StringBuffer br=new StringBuffer(str);
            System.out.println(br.reverse());
        }
        System.out.println("________________________");

        //traversing using ITERATOR: Forward traversing
        Iterator<String> itr = names.iterator();

        while(itr.hasNext())
        {
            String next = itr.next();
            System.out.println(next);
        }
        System.out.println("+++++++++++++++++++++++");

        //backward traversal of collection LISTITERATOR
        ListIterator<String> litr = names.listIterator(names.size());
        while(litr.hasPrevious())
        {
            String previous = litr.previous();
            System.out.println(previous);
        }

        //Enumeration
        System.out.println("++++++++FOR EACH METHOD+++++++++++++");
        //for each method

        names.forEach(str->{
            System.out.println(str);
        });

        System.out.println("SORTING OF ELEMENTS");
        TreeSet<String> set=new TreeSet<>();
        set.addAll(names);
        set.forEach(e->{
            System.out.println(e);
        });

//        Comparable
//        Comparator




    }



}