package PrajwalPrograms.practise;

public class BB extends AA{

    public static void tt1(){
        System.out.println("heelo 22");
    }

    public void pp(){
        System.out.println("non static 2 here!!");
    }

    public static void main(String[] args) {
        AA a=new BB();

        a.tt1();
        a.pp();
    }
}
