package PrajwalPrograms.ProgramsInterviewPractise;

public class Ques2 { //You need to write a Java method to find the maximum sum of a subarray within a given array. Write the method.

    static int calresult(int b[]){

        int currentSum= b[0];
        int maxSum= b[0];

        for(int i=1;i<b.length;i++){

            currentSum = Math.max(b[i], currentSum + b[i]);
            maxSum     = Math.max(maxSum,currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {

        int a[]={ 1,2,-1};
//        int a[]={-2, 1, -3, 4, -1, 2, 1, -5, 4};

//        int result = calresult(a);

//        System.out.println(result);
        //{1,2}


    }
}
