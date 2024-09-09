package PrajwalPrograms.generics;

public class C <P,M>{

    private P name;
    private M age;

    public void set(P name, M age){
        this.name=name;
        this.age=age;
    }

    public void get(){

        System.out.println("given name is: "+ this.name);
        System.out.println("given age  is: "+this.age);
    }
}
