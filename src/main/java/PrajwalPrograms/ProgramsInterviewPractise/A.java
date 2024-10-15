package PrajwalPrograms.ProgramsInterviewPractise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class A {

    public static void main(String[] args) {  //first non repeating character

        String str="abbca";
        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i=0;i<str.length();i++){

            if(hm.containsKey(str.charAt(i))){
                hm.put(str.charAt(i),hm.get(str.charAt(i))+1);
            }
            else{
                hm.put(str.charAt(i),1);
            }
        }
        System.out.println(hm);

        for(Map.Entry<Character,Integer> mm: hm.entrySet()){
            if(mm.getValue()==1){
                System.out.println(mm.getKey());
                break;
            }
        }

//        for(int i=0;i<str.length();i++){
//
//            if(hm.get(str.charAt(i))==1){
//                System.out.println(i);
//                break;
//            }
//        }
    }

}
