package PrajwalPrograms.comparableAndComparator;

import java.util.Comparator;

public class CompLogic implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.salary-e2.salary;
    }

}
