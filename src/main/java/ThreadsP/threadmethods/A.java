package ThreadsP.threadmethods;

public class A extends Thread{

    public void run(){

        System.out.println();
        System.out.println("hello....");
        Thread t2= Thread.currentThread();
        System.out.println(t2.getName());
        System.out.println(t2.getId());
        System.out.println();
    }

    public static void main(String[] args) {

        A a1=new A();
        System.out.println("started main method !!");
        Thread thread1 = Thread.currentThread();//will give current thread object
        System.out.println(thread1.getName());
        System.out.println(thread1.getId());

        a1.start();

    }
}
