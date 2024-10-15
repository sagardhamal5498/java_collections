package PrajwalPrograms.streampractise2;

import java.util.Arrays;
import java.util.Comparator;

public class EImp {  //Find the Word with the Highest Number of Vowels with & without stream api

    public static void main(String[] args) {
        String s="afj jullu bo all tuejaju po m";
        String[] s1 = s.split(" ");

        Arrays.stream(s1);

//        String result = Arrays.stream(s1)
//                .max(Comparator.comparingLong(x -> x.chars().mapToObj(y -> (char) y).filter(y -> "aeiouAEIOU".indexOf(y) != -1).count())).get();

//        System.out.println(result);


//        String ss="jockeya";
//        char[] ch = ss.toCharArray();
//
//        for (int i=0;i<ch.length;i++){
//
//            int ii = "aeiou".indexOf(ch[i]);
//            System.out.println(ch[i]+" = "+ii);
//        }

        //without stream api
//        String word=null;
//        String result=null;
//        int max=0;
//        int temp=0;

//        for(int i=0;i<s1.length;i++){
//
//            word=s1[i];
//            for(int j=0;j< word.length();j++) {
//                if (word.charAt(j) == 'a' || word.charAt(j) == 'i' || word.charAt(j) == 'o' || word.charAt(j) == 'u' || word.charAt(j) == 'e') {
//                    max++;
//                }
//            }
//
//            if(max>temp) {
//                temp=max;
//                result=word;
//                max=0;
//            }else {
//                max=0;
//            }
//        }
//
//        System.out.println(result);
//        System.out.println(temp);
    }
}
