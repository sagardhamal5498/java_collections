package PrajwalPrograms.ProgramsInterviewPractise;

import java.util.Random;

public class Ques5 {

    // You need to write a Java program to monitor the performance of a broadband service
    // and alert when the response time exceeds 500ms. Write the program

    private static int threshold=500;

    public static void main(String[] args) {

//        long live = System.currentTimeMillis();
//        System.out.println(live);


//        while (true){
//            int time = responseTime();
//            System.out.println("current response time:- "+ time+"ms");
//
//            if(time>threshold){
//                alert(time);
//                break;
//            }
//
//            try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}  //take pause for 1 sec before creating new response
//        }
    }

    static int responseTime(){

        Random random = new Random();
        int res = random.nextInt(100, 1000);
        return res;
    }

    static void alert(int response){
        System.out.println("Alert!!! --> response time is more than :-"+response+"ms");
    }


}
