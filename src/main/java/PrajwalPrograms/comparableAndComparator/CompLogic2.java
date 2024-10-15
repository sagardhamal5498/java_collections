package PrajwalPrograms.comparableAndComparator;

import java.util.Comparator;

public class CompLogic2 implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.name.compareTo(e2.name);
    }

}
