package PrajwalPrograms.ProgramsInterviewPractise;

public class PP {

    public static void main(String[] args) {  //find if * is there ;if present then delete * with left element of star

//        Input: s = "aaba*"
//
//        Output: "aab"

        String st = "aaba*";
        String res=null;
        int tp=0;

        StringBuffer sb=new StringBuffer(st);

        for(int i=0;i<sb.length();i++){

            if(sb.charAt(i)=='*'){

                sb.delete(i - 1, i+1);
            }
        }

//        System.out.println(res);

    }

}
