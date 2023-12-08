package org.Kevin;

import lombok.Getter;
import lombok.Setter;

/**
 * Teacher class
 *
 * @author Kevin-Yichen Li
 */
@Getter
@Setter
public class Teacher {
    private String lName;
    private String fName;
    private Department department;
    private String id;
    private static int nextId = 1;

    public Teacher(String fName, String lName, Department department) {
        this.fName = fName;
        this.lName = lName;
        this.department = department;
        this.id = String.format("T%03d", nextId++);
    }

    @Override
    public String toString() {
        String teacherName = "";
        if (fName != null) {
            teacherName += fName + " " + lName;
        }

        return "Teacher{" +
                "name='" + teacherName + '\'' +
                ", department=" + department +
                ", id='" + id + '\'' +
                '}';
    }
}
