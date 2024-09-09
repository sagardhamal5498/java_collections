package ThreadsP.consumerproducer;

public class Company extends Thread{

    boolean flag=true;
    int i;

    synchronized public void produce_item(int n){
//        if(flag==false){
//            try{ wait(); }catch (Exception e){}
//        }
        this.i=n;
        System.out.println("produced the item :"+ this.i);
        flag=false;
//        notify();
    }

    synchronized public void consume_item() throws Exception{

//        if(flag==true){
//            wait();
//        }

        System.out.println("consumed the item :"+ this.i);
        flag=true;
//        notify();
    }
}
