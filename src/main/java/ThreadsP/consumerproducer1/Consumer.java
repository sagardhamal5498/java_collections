package ThreadsP.consumerproducer1;

public class Consumer extends Thread{

    public Company company;

    Consumer(Company company){
        this.company=company;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(1000);
            company.consumer();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
