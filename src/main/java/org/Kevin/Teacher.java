package org.Kevin;

import lombok.Getter;

/**
 * Teacher class
 *
 * @author Kevin-Yichen Li
 */
public class Teacher {
    private String lName;
    private String fName;
    private Department department;
    @Getter
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
        return "Teacher{" +
                "lName='" + lName + '\'' +
                ", fName='" + fName + '\'' +
                ", department=" + department +
                ", id='" + id + '\'' +
                '}';
    }
}
