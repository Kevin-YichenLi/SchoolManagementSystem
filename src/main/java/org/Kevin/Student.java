package org.Kevin;

import lombok.Getter;
import lombok.Setter;

/**
 * Student class
 *
 * @author Kevin-Yichen Li
 */
@Setter
@Getter
public class Student {
    private static final int MAX_COURSE_NUM = 5;
    private String fName;
    private Course[] courses;
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
        courses = new Course[MAX_COURSE_NUM];
        for (int i = 0; i < MAX_COURSE_NUM; i++) {
            courses[i] = new Course();
        }
    }

    public Student() {
        fName = "test";
        lName = "test";
    }

    @Override
    public String toString() {
        int checker = 0;
        String coursesName = "[";

        for (Course course : courses) {
            if (course != null && !course.getCourseName().equals("test")) {
                coursesName += course.getCourseName() + ", ";
                checker++;
            }
        }

        if (checker == 0) {
            coursesName += "]";
        } else {
            coursesName = coursesName.substring(0, coursesName.length() - 2) + "]";
        }

        String studentName = "";
        if (!fName.equals("test")) {
            studentName += fName + " " + lName;
        }

        return "Student{" +
                "name='" + studentName + '\'' +
                ", courses=" + coursesName +
                ", id='" + id + '\'' +
                ", courseNum=" + courseNum +
                ", department=" + department +
                '}';
    }
}
