package org.Kevin;

import lombok.Getter;
import lombok.Setter;

/**
 * Department class
 *
 * @author Kevin-Yichen Li
 */
@Getter
@Setter
public class Department {
    private String id;
    private static int nextId = 1;
    private String departmentName;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.id = String.format("D%03d", nextId++);
    }

    @Override
    public String toString() {
        return "Department{" +
                "id='" + id + '\'' +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
