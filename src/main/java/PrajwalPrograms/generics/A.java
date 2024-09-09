package PrajwalPrograms.generics;

public class A<P> {


    private P name;

    A(P namee){
        this.name=namee;
    }

    P get(){
        return this.name;
    }
}
