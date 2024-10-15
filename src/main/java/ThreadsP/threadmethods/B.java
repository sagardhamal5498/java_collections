package ThreadsP.threadmethods;

import java.util.concurrent.ThreadLocalRandom;

public class B extends Thread{

    public void run(){
        System.out.println("Hello ...");

        Thread thread = Thread.currentThread();
        thread.setName("mera thread!!");
        System.out.println(thread.getName());
    }

    public static void main(String[] args) {

        B b1=new B();

        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
        b1.start();


    }
}
