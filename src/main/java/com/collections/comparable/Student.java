package com.collections.comparable;

public class Student implements Comparable<Student>{


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

//    @Override
//    public int compareTo(Student stud) {
//        return this.id - stud.id;
//    }

    @Override
    public int compareTo(Student stud) {
        return this.name.compareTo(stud.name);
    }

}
