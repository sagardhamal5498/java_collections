package ThreadsP.basicImplementation;

public class A extends Thread{


    @Override
    public void run() {

        for(int i=10;i>=1;i--){
            System.out.println("Thread Two :- "+ i);
            try{Thread.sleep(1000);}catch (Exception e){   }
        }

    }
}
