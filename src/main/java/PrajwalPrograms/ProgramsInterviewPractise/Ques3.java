package PrajwalPrograms.ProgramsInterviewPractise;

import java.util.ArrayList;

public class Ques3 {  //convert arraylist to array

    public static void main(String[] args) {

        ArrayList<Integer> data = new ArrayList<>();

        data.add(12);
        data.add(34);
        data.add(50);

        //1st method
        Integer[] pp = data.toArray(new Integer[0]);

        for(int z: pp){
            System.out.println(z);
        }


        System.out.println("--------------------------");
        //2nd method

        int aa[]=new int[data.size()];
        int index=0;

        for(int i=0;i<aa.length;i++){
            aa[index]= data.get(i);
            index++;
        }

        for(int z:aa){
            System.out.println(z);
        }

    }
}
