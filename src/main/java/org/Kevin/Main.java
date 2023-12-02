package org.Kevin;

/**
 * School management system
 *
 * @author Kevin-Yichen Li
 */
public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem schoolManagementSystem1 = new SchoolManagementSystem();

        // create departments
        Department math = new Department("Math");
        Department french = new Department("French");

        // create teachers
        Teacher kevin = new Teacher("Kevin", "Kevin", math);

        // create courses
        Course calculus = new Course("Calculus", 2.7, math);

        // add departments
        schoolManagementSystem1.addDepartment(math);
        schoolManagementSystem1.addDepartment(french);

        // add courses
        schoolManagementSystem1.addCourse(calculus);

        // add teachers
        schoolManagementSystem1.addTeacher(kevin);

        // printings
        schoolManagementSystem1.printDepartments();
        schoolManagementSystem1.printTeachers();

        // modify teacher
        schoolManagementSystem1.modifyCourseTeacher("T001", "C001");
    }
}
