package ThreadsP.joins;

public class Impl {

    public static void main(String[] args) throws InterruptedException {

        A a1 =new A("Hello 1");
        a1.setName("Thread 1");

        A a2 =new A("Hello 2");
        a2.setName("Thread 2");

        A a3 =new A("Hello 3");
        a3.setName("Thread 3");

        a1.start();
        a2.start();
        a3.start();

//        a1.start();
//        a1.join();
//        a2.start();
//        a2.join();
//        a3.start();
//        a3.join();
    }
}
