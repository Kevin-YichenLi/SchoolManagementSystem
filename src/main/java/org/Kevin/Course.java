package org.Kevin;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

/**
 * Course class
 *
 * @author Kevin-Yichen Li
 */
public class Course {
    private static final int MAX_STUDENT_NUM = 5;
    private double credit;
    @Getter
    private String id;
    private Student[] students;
    private Department department;
    private int studentNum;
    @Setter
    private Teacher teacher;
    private String courseName;
    private static int nextId = 1;

    public Course(String courseName, double credit, Department department) {
        this.courseName = courseName;
        this.credit = credit;
        this.department = department;
        this.id = String.format("C%03d", nextId++);
    }

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
