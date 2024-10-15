package PrajwalPrograms.ProgramsInterviewPractise;

public class Array2d {

    public static void main(String[] args) {

        int row=3;
        int col=2;
         int [][]a= new int[3][2];


        System.out.println(a.length);
        System.out.println(a[0].length);

         int value=1;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){

                a[i][j]=value;
                value++;
            }
        }


         for(int i=0;i<row;i++){
             for(int j=0;j<col;j++){

                 System.out.println(i+ " "+j +" = "+ a[i][j]);
             }
         }



    }
}
