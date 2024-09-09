package ThreadsP.consumerproducer1;

public class Company {

    int i;
    boolean flag=true;

    synchronized public void producer(int i) throws Exception{
        if(flag==false){
            try{wait();}catch (Exception e){ }
        }
        this.i=i;
        System.out.println("produced item :" +i);
        flag=false;
        notify();
    }

    synchronized public void consumer() throws Exception{
        if(flag==true){
            try{wait();}catch (Exception e){ }
        }

        System.out.println("consumed item: "+ this.i);

        flag=true;
        notify();
    }

}
