package ThreadsP.waitNotifyNotifyall;

public class A extends Thread{

    int balance=0;

    @Override
    public synchronized void run() {

        for(int i=1;i<=100;i++){
            balance++;
        }
        notify();
    }

}
