package org.Kevin;

import lombok.Getter;

import java.util.Arrays;

/**
 * Student class
 *
 * @author Kevin-Yichen Li
 */
public class Student {
    private static final int MAX_COURSE_NUM = 5;
    private String fName;
    private Course[] courses;
    @Getter
    private String id;
    private int courseNum;
    private static int nextId = 1;
    private String lName;
    private Department department;

    public Student(String fName, String lName, Department department) {
        this.fName = fName;
        this.lName = lName;
        this.department = department;
        this.id = String.format("S%03d", nextId++);
    }

    @Override
    public String toString() {
        return "Student{" +
                "fName='" + fName + '\'' +
                ", courses=" + Arrays.toString(courses) +
                ", id='" + id + '\'' +
                ", courseNum=" + courseNum +
                ", lName='" + lName + '\'' +
                ", department=" + department +
                '}';
    }
}
