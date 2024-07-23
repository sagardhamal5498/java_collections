package com.collections.sorting.comparable;

public class Employee implements Comparable<Employee> {

    private int id;
    private String name;
    private int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }


    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }
}
