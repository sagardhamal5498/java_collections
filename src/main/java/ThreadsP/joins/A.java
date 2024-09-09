package ThreadsP.joins;

public class A extends Thread {

    String str;

    A(String str ){
        this.str=str;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " execution started "+ str);

        try {Thread.sleep(4000);} catch (InterruptedException e) {throw new RuntimeException(e); }

        System.out.println(Thread.currentThread().getName()+ " execution finished "+ str );
    }
}
