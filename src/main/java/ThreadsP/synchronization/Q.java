package ThreadsP.synchronization;

public class Q extends P{

    public static void main(String[] args) {

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {

                for(int i=1;i<=1000;i++){
                    creditbalance();
                }
            }
        });

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {

                for(int i=1;i<=500;i++){
                    debitbalance();
                }
            }
        });

        t1.start();
        t2.start();

        try {                    //if we dont handle like this then main thread will print balance anytime in the middle
            t1.join();
            t2.join();
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(balance);


    }
}
