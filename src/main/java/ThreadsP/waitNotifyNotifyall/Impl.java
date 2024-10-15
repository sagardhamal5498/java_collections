package ThreadsP.waitNotifyNotifyall;

public class Impl {

    public static void main(String[] args) {

        A a1=new A();
//
//        a1.start();
//
//        /* we know that main thread runs first but we want to run the "run()" first and then display balance,
//			   so to prevent main from running first we are using synchronized block here*/
//
//        synchronized (a1){
//            try {
//                a1.wait();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//
//        System.out.println(a1.balance);
    }
}
