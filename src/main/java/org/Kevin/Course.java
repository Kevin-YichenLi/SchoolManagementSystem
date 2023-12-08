package org.Kevin;

import lombok.Getter;
import lombok.Setter;

/**
 * Course class
 *
 * @author Kevin-Yichen Li
 */
@Getter
@Setter
public class Course {
    private static final int MAX_STUDENT_NUM = 5;
    private double credit;
    private String id;
    private Student[] students;
    private Department department;
    private int studentNum;
    private Teacher teacher;
    private String courseName;
    private static int nextId = 1;

    public Course(String courseName, double credit, Department department) {
        this.courseName = courseName;
        this.credit = credit;
        this.department = department;
        this.id = String.format("C%03d", nextId++);
        this.students = new Student[MAX_STUDENT_NUM];
        for (int i = 0; i < MAX_STUDENT_NUM; i++) {
            students[i] = new Student();
        }
    }

    public Course() {
        this.courseName = "test";
    }

    @Override
    public String toString() {
        int checker = 0;
        String studentsName = "[";
        for (Student student : students) {
            if (student != null && !student.getFName().equals("test")) {
                studentsName += student.getFName() + " " + student.getLName() + ", ";
                checker++;
            }
        }

        if (checker == 0) {
            studentsName += "]";
        } else {
            studentsName = studentsName.substring(0, studentsName.length() - 2) + "]";
        }

        return "Course{" +
                "credit=" + credit +
                ", id='" + id + '\'' +
                ", students=" + studentsName +
                ", department=" + department +
                ", studentNum=" + studentNum +
                ", teacher=" + teacher +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
