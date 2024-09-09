package ThreadsP.consumerproducer;

public class Producer extends Thread{

    public Company company;

    Producer(Company company){
        this.company=company;
    }

    @Override
    public void run() {
        int i=1;

        while(true && i<5) {
            company.produce_item(i);
            try{
                Thread.sleep(2000);
            }catch (Exception e){
                System.out.println(e);
            }

            i++;
        }
    }
}
