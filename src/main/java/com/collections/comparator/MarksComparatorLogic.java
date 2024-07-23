package com.collections.comparator;

import java.util.Comparator;

public class MarksComparatorLogic implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getMarks()-s2.getMarks();
    }
}
