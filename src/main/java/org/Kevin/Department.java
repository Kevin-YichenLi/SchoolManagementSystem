package org.Kevin;

/**
 * Department class
 *
 * @author Kevin-Yichen Li
 */
public class Department {
    private String id;
    private static int nextId = 1;
    private String departmentName;

    /**
     * constructor
     *
     * @param departmentName name of the department
     */
    public Department(String departmentName) {

    }

    /**
     * to string
     *
     * @return string value of information of department
     */
    @Override
    public String toString() {
        return "Department{" +
                "id='" + id + '\'' +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
