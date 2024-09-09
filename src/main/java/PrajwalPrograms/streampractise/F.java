package PrajwalPrograms.streampractise;

import java.util.Arrays;
import java.util.List;

public class F {  //sum of digits in a given string

    public static void main(String[] args) {


        String str="12sagar89dhamal";

        char[] ch = str.toCharArray();
        char[] ch2= new char[ch.length];
        int sum=0;

        for(int i=0;i<ch.length;i++){

            if(Character.isDigit(ch[i])){

                String s1 = Character.toString(ch[i]);
//                String ss = String.valueOf(ch[i]);
                Integer i1 = Integer.valueOf(s1);
                sum=sum+i1;
            }
        }
        System.out.println(sum);

        for(int i=0;i<str.length();i++){
            if (Character.isDigit(str.charAt(i))) {

                sum = sum + Character.getNumericValue(str.charAt(i));
            }
        }
        System.out.println(sum);


    }
}
