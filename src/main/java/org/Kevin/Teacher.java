package org.Kevin;

/**
 * Teacher class
 *
 * @author Kevin-Yichen Li
 */
public class Teacher {
    private String lName;
    private String fName;
    private Department department;
    private String id;

    /**
     * constructor
     *
     * @param fName      first name of teacher
     * @param lName      last name of teacher
     * @param department department of teacher
     */
    public Teacher(String fName, String lName, Department department) {

    }

    /**
     * to string
     *
     * @return string value of information of teacher
     */
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
