package org.Kevin;

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
    private String id;
    private int courseNum;
    private static int nextId = 1;
    private String lName;
    private Department department;

    /**
     * constructor
     *
     * @param fName      first name of student
     * @param lName      last name of student
     * @param department department of student
     */
    public Student(String fName, String lName, Department department) {
        this.fName = fName;
        this.lName = lName;
        this.department = department;
    }

    /**
     * to string
     *
     * @return string value of information of student
     */
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
