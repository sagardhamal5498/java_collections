package PrajwalPrograms.streampractisecpt;

import java.util.Arrays;

public class B {  //longest common prefix

    public static void main(String[] args) {

        String[] ww = {"flower", "flowe", "flowight"};

        String st=ww[0];
        StringBuilder sb = new StringBuilder();

        for(int j=1;j<ww.length;j++){

            String st2=ww[j];

            if(sb.isEmpty()) {
                for (int i = 0; i < st2.length(); i++) {
                    if (st.charAt(i) == st2.charAt(i)) {
                        sb.append(st.charAt(i));
                    }
                }
            }
            else{
                String temp=sb.toString();
                sb=new StringBuilder();

                for(int i=0;i<temp.length();i++){
                    if(temp.charAt(i)==st2.charAt(i)){
                        sb.append(temp.charAt(i));
                    }
                }
            }
        }

        System.out.println(sb);

    }
}
