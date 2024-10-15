package PrajwalPrograms.mapAndFlatmap;

import java.util.List;

public class Employee {

    private int id;
    private String dept;
    private List<Integer> phone;

    public Employee( int id,String dept, List<Integer> phone) {
        this.dept = dept;
        this.id = id;
        this.phone = phone;
    }

    public String getDept() {
        return dept;
    }

    public int getId() {
        return id;
    }

    public List<Integer> getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "dept='" + dept + '\'' +
                ", id=" + id +
                ", phone=" + phone +
                '}';
    }
}
