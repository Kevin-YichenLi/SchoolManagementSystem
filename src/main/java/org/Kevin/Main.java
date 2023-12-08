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

        // create students
        Student tomato = new Student("Tomato", "Tomato", math);

        // add departments
        schoolManagementSystem1.addDepartment(math);
        schoolManagementSystem1.addDepartment(french);

        // add courses
        schoolManagementSystem1.addCourse(calculus);

        // add teachers
        schoolManagementSystem1.addTeacher(kevin);

        // add students
        schoolManagementSystem1.addStudent(tomato);

        // find course
        System.out.println(schoolManagementSystem1.findCourse("C001"));

        // find department
        System.out.println(schoolManagementSystem1.findDepartment("D001"));

        // find student
        System.out.println(schoolManagementSystem1.findStudent("S001"));

        // find teacher
        System.out.println(schoolManagementSystem1.findTeacher("T001"));

        // modify teacher
        schoolManagementSystem1.modifyCourseTeacher("T001", "C001");

        // register course
        schoolManagementSystem1.registerCourse("S001", "C001");
        schoolManagementSystem1.registerCourse("S001", "C001");

        // printings
        schoolManagementSystem1.printDepartments();
        schoolManagementSystem1.printTeachers();
        schoolManagementSystem1.printStudents();
        schoolManagementSystem1.printCourses();
    }
}
