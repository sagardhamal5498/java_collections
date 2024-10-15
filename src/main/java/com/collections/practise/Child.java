package com.collections.practise;

public class Child extends Parent{

    @Override
    public void run() {
        System.out.println("child runs");
        super.run();
    }

    @Override
    public void walk() {
        System.out.println("child walksf");
        super.walk();
    }
}
