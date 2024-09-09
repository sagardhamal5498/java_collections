package PrajwalPrograms.cloning;

public class A implements Cloneable{

    int b=500;

    public static void main(String[] args) {

        A a1 = new A();
        a1.b = 900;
        System.out.println(a1.b);

        A a2 = a1;
        System.out.println(a2.b);

        try {
            A a3 = (A)a1.clone();
            System.out.println(a3.b);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }
    }
