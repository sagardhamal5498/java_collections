package PrajwalPrograms.streampractiseArray3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D {

    public static void main(String[] args) {  //"1","2","3","5","9","a",

        String st="12359a6784@-5-7-3";
        String []s={"6","7","8","4","3","4","5","1","@","-5","-4","-7","-6","-5"};
        String regex="[0-9]";
        StringBuilder sb=new StringBuilder();
        int[] bb=new int[s.length];
        int count=0;

        for(int i=0;i<s.length;i++){
            Pattern compile = Pattern.compile(regex);
            Matcher matcher = compile.matcher(s[i]);

            if(matcher.find()){
//                System.out.println(matcher.group());
                sb.append(s[i]);
//                System.out.println(s[i]);
                bb[count]=Integer.valueOf(s[i]);
                count++;
            }
        }

//        System.out.println(sb);

//        for(int i:bb){
//            System.out.println(i);
//        }


        for(int i=0;i<bb.length;i++){

            StringBuilder sb2=new StringBuilder();
            for(int j=bb[i];j>0||j<0;j++){

                if(bb[i]==j){
                    sb2.append(String.valueOf(bb[i]));
                    i++;
                }
                else{
                    i--;
                    break;
                }
            }

            if(sb2.length()!=1) {
                System.out.println(sb2);
            }
        }

//        for(int i=0;i<bb.length;i++){
//
//            StringBuilder sb2=new StringBuilder();
//            int k=0;
//
//            for(int j=bb[i];j>0;j++){
//
//                if(bb[i]==j){
//                    sb2.append(String.valueOf(bb[i]));
//                    k=i++;
//                }
//                else{
//                    break;
//                }
//            }
//
//            System.out.println("length:- "+sb2.length());
//                System.out.println(sb2);
//        }


    }
}
