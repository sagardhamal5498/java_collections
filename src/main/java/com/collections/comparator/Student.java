package com.collections.comparator;

public class Student{


    private int id;
    private String name;
    private int marks;

    public Student(int id, int marks, String name) {
        this.id = id;
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public int getId() {
        return id;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

}
