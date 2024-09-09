package PrajwalPrograms.streampractise4;

public class D {

    public static void main(String[] args) {

        String s="jfdl#tre@jl*";
        StringBuilder sb=new StringBuilder(s);

        for(int i=s.length()-1;i>=0;i--){

            System.out.println(s.charAt(i));

        }
    }
}
