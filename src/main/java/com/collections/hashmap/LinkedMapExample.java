package com.collections.hashmap;
import java.util.*;

public class LinkedMapExample {

    public static void main(String[] args) {

        //First Non-repeating  character

        String str = "Sagar";
         char[] chr = str.toCharArray();
     LinkedHashMap<Character, Integer> lhm = new java.util.LinkedHashMap<>();

     for(int i=0;i<=chr.length-1;i++){
        if(lhm.containsKey(chr[i])){
             lhm.put(chr[i],lhm.get(chr[i])+1);
         }else {
            lhm.put(chr[i],1);
        }

     }
        System.out.println(lhm);
       for(Map.Entry<Character,Integer> entry :lhm.entrySet()){
           if(entry.getValue()==1){
               System.out.println(entry.getKey());
               break;
           }
       }
    }
}
