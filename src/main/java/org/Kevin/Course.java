package org.Kevin;

import java.util.Arrays;

/**
 * Course class
 *
 * @author Kevin-Yichen Li
 */
public class Course {
    private static final int MAX_STUDENT_NUM = 5;
    private double credit;
    private String id;
    private Student[] students;
    private Department department;
    private int studentNum;
    private Teacher teacher;
    private String courseName;

    /**
     * constructor
     *
     * @param courseName name of the course
     * @param credit     credit of the course
     * @param department department of the course
     */
    public Course(String courseName, double credit, Department department) {

    }

    /**
     * to string
     *
     * @return string value of information of course
     */
    @Override
    public String toString() {
        return "Course{" +
                "credit=" + credit +
                ", id='" + id + '\'' +
                ", students=" + Arrays.toString(students) +
                ", department=" + department +
                ", studentNum=" + studentNum +
                ", teacher=" + teacher +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
