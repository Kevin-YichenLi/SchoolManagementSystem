package org.Kevin;

/**
 * SchoolManagementSystem class
 *
 * @author Kevin-Yichen Li
 */
public class SchoolManagementSystem {
    private static final int MAX_DEPARTMENT_NUM = 5;
    private static final int MAX_STUDENT_NUM = 200;
    private static final int MAX_TEACHER_NUM = 20;
    private static final int MAX_COURSE_NUM = 30;

    private Student[] students;
    private Teacher[] teachers;
    private Department[] departments;
    private Course[] courses;
    private String name;

    /**
     * Constructor
     *
     * @param name of the system
     */
    public SchoolManagementSystem(String name) {
        this.name = name;
    }

    /**
     * to find a particular department among all departments
     *
     * @param departmentId id of the department
     * @return the specific department that we want find
     */
    public Department findDepartment(String departmentId) {
        return null;
    }

    /**
     * to find a particular student among all students
     *
     * @param studentId id of the student
     * @return the specific student that we want find
     */
    public Student findStudent(String studentId) {
        return null;
    }

    /**
     * to find a particular teacher among all teachers
     *
     * @param teacherId id of the teacher
     * @return the specific teacher that we want find
     */
    public Teacher findTeacher(String teacherId) {
        return null;
    }

    /**
     * to find a particular course among all courses
     *
     * @param courseId id of the course
     * @return the specific course that we want find
     */
    public Course findCourse(String courseId) {
        return null;
    }

    /**
     * to print information of a teacher
     */
    public void printTeachers() {

    }

    /**
     * to print information of a student
     */
    public void printStudents() {

    }

    /**
     * to print information of a course
     */
    public void printCourses() {

    }

    /**
     * to print information of a department
     */
    public void printDepartments() {

    }

    /**
     * to add a teacher in the system
     *
     * @param teacher a specific teacher to add
     */
    public void addTeacher(Teacher teacher) {

    }

    /**
     * to add a department in the system
     *
     * @param department a specific department to add
     */
    public void addDepartment(Department department) {

    }

    /**
     * to add a course in the system
     *
     * @param course a specific course to add
     */
    public void addCourse(Course course) {

    }

    /**
     * to add a student in the system
     *
     * @param student a specific student to add
     */
    public void addStudent(Student student) {

    }

    /**
     * to assign a student to a course
     *
     * @param student a specific student
     * @param course  a specific course
     */
    public void registerCourse(Student student, Course course) {

    }

    /**
     * to modify the teacher of a course
     *
     * @param newTeacher new teacher assigned to the course
     * @param course     the course that needed to change teacher
     */
    public void modifyCourseTeacher(Teacher newTeacher, Course course) {

    }

}
