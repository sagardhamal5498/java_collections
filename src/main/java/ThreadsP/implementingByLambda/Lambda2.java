package ThreadsP.implementingByLambda;

public class Lambda2 extends Thread{

    public static void main(String[] args) {

        Thread t1=new Thread(
                ()->{

                    for(int i=0;i<=10;i++){
                        System.out.println(i);
//                        try {Thread.sleep(2000);} catch (InterruptedException e) {throw new RuntimeException(e);}
                    }
                }
        );

        Thread t2=new Thread(
                ()->{

                    for(int i=100;i<=110;i++){
                        System.out.println(i);
//                        try {Thread.sleep(2000);} catch (InterruptedException e) {throw new RuntimeException(e);}
                    }
                }
        );

        t1.start();
        t2.start();


    }
}
