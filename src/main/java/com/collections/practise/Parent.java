package com.collections.practise;

public class Parent {

    public void walk(){
        System.out.println("parent walks");
    }

    public void run(){
        System.out.println("parent runs");
        walk();
    }
}
