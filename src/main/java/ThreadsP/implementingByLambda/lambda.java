package ThreadsP.implementingByLambda;

public class lambda {

    public static void main(String[] args) throws Exception {

        Thread t1= new Thread(
                ()->{
                    for (int i=0;i<=5;i++){
                        System.out.println("hello 1");
                        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}
                    }
                }
        );

        Runnable rr= ()->{
            for(int i=0;i<=5;i++){
                System.out.println("runnable");
                try {Thread.sleep(2000);} catch (InterruptedException e) {throw new RuntimeException(e);}
            }
        };
        Thread t3=new Thread(rr);

        t1.start();
        t1.join();
        t3.start();
        t3.join();

//        for(int i=0;i<5;i++){
//            System.out.println("main");
//            try {Thread.sleep(3000);} catch (InterruptedException e) {throw new RuntimeException(e);}
//        }
    }
}
