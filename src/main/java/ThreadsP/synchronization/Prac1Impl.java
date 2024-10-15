package ThreadsP.synchronization;

import static ThreadsP.synchronization.Prac1.*;

public class Prac1Impl{

    public static void main(String[] args) throws Exception{

        Thread tt=new Thread(()-> addBalance(9000));
        tt.start();
        tt.join();

        Thread tt1=new Thread(()-> deductBalance(8000));
        tt1.start();
        tt1.join();

        System.out.println("main thread exe.");
        System.out.println("balance:-  " +balance);

    }


}
