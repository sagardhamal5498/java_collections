package com.collections.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TwoSum {

    public static void main(String[] args) {

        /*
        Two Sum
         */
        int arr[] = {12,56,32,4,6};
         HashMap<Integer, Integer> hm = new HashMap<>();
         int target = 10;
         for(int i=0;i<=arr.length-1;i++){
             int complement = target-arr[i];
             if(hm.containsKey(complement)){
                 System.out.println("index  "+hm.get(complement)+" "+i);
             }
             hm.put(arr[i],i);
         }

         /*
         Double Elements
          */
         int nums[] = {1,5,5,7,85,6,1,79,12};

        final HashMap<Integer, Integer> hmm = new HashMap<>();
        for(Integer i :nums){
            hmm.put(i,hmm.getOrDefault(i,0)+1);
        }

        System.out.println(hmm);
        for (Map.Entry<Integer,Integer> entry :hmm.entrySet()){
           if(entry.getValue()==2){
               System.out.println(entry.getKey());
           }

        }




    }
}
