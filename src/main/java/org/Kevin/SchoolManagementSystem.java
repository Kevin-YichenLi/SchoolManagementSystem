package org.Kevin;

import java.util.Arrays;

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

    public SchoolManagementSystem() {
        this.students = new Student[MAX_STUDENT_NUM];
        this.teachers = new Teacher[MAX_TEACHER_NUM];
        this.departments = new Department[MAX_DEPARTMENT_NUM];
        this.courses = new Course[MAX_COURSE_NUM];
    }

    /**
     * to find a particular department among all departments
     *
     * @param departmentId id of the department
     * @return the specific department that we want find
     */
    public Department findDepartment(String departmentId) {
        for (Department department : departments) {
            if (department != null && departmentId.equals(department.getId())) {
                return department;
            }
        }
        return null;
    }

    /**
     * to find a particular student among all students
     *
     * @param studentId id of the student
     * @return the specific student that we want find
     */
    public Student findStudent(String studentId) {
        for (Student student : students) {
            if (student != null && studentId.equals(student.getId())) {
                return student;
            }
        }
        return null;
    }

    /**
     * to find a particular teacher among all teachers
     *
     * @param teacherId id of the teacher
     * @return the specific teacher that we want find
     */
    public Teacher findTeacher(String teacherId) {
        for (Teacher teacher : teachers) {
            if (teacher != null && teacherId.equals(teacher.getId())) {
                return teacher;
            }
        }
        return null;
    }

    /**
     * to find a particular course among all courses
     *
     * @param courseId id of the course
     * @return the specific course that we want find
     */
    public Course findCourse(String courseId) {
        for (Course course : courses) {
            if (course != null && courseId.equals(course.getId())) {
                return course;
            }
        }
        return null;
    }

    /**
     * to print information of a teacher
     */
    public void printTeachers() {
        System.out.println(Arrays.toString(teachers));
    }

    /**
     * to print information of a student
     */
    public void printStudents() {
        System.out.println(Arrays.toString(students));
    }

    /**
     * to print information of a course
     */
    public void printCourses() {
        System.out.println(Arrays.toString(courses));
    }

    /**
     * to print information of a department
     */
    public void printDepartments() {
        System.out.println(Arrays.toString(departments));
    }

    /**
     * to add a teacher in the system
     *
     * @param teacher a specific teacher to add
     */
    public void addTeacher(Teacher teacher) {
        for (int i = 0; i < MAX_TEACHER_NUM; i++) {
            if (teachers[i] == null) {
                teachers[i] = teacher;
                System.out.println(teacher + " added successfully");
                break;
            }
        }

        if (teachers[MAX_TEACHER_NUM - 1] != null) {
            System.out.println("Max teacher reached, add a new teacher failed.");
        }
    }

    /**
     * to add a department in the system
     *
     * @param department a specific department to add
     */
    public void addDepartment(Department department) {
        for (int i = 0; i < MAX_DEPARTMENT_NUM; i++) {
            if (departments[i] == null) {
                departments[i] = department;
                System.out.println(department + " added successfully");
                break;
            }
        }

        if (departments[MAX_DEPARTMENT_NUM - 1] != null) {
            System.out.println("Max department reached, add a new department failed.");
        }
    }

    /**
     * to add a course in the system
     *
     * @param course a specific course to add
     */
    public void addCourse(Course course) {
        for (int i = 0; i < MAX_COURSE_NUM; i++) {
            if (courses[i] == null) {
                courses[i] = course;
                System.out.println(course + " added successfully");
                break;
            }
        }

        if (courses[MAX_COURSE_NUM - 1] != null) {
            System.out.println("Max course reached, add a new course failed.");
        }
    }

    /**
     * to add a student in the system
     *
     * @param student a specific student to add
     */
    public void addStudent(Student student) {
        for (int i = 0; i < MAX_STUDENT_NUM; i++) {
            if (students[i] == null) {
                students[i] = student;
                System.out.println(student + " added successfully");
                break;
            }
        }

        if (students[MAX_STUDENT_NUM - 1] != null) {
            System.out.println("Max student reached, add a new student failed.");
        }
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
     * @param teacherId the id of new teacher assigned to the course
     * @param courseId  the id of the course that needed to change teacher
     */
    public void modifyCourseTeacher(String teacherId, String courseId) {
        int teacherChecker = 0;
        int courseChecker = 0;

        for (Teacher teacher : teachers) {
            if (teacher == null || !teacherId.equals(teacher.getId())) {
                teacherChecker++;
                continue;
            }

            for (Course course : courses) {
                if (course == null || !courseId.equals(course.getId())) {
                    courseChecker++;
                    continue;
                }
                course.setTeacher(teacher);
                System.out.println(course + " teacher info updated successfully");
            }
        }

        if (teacherChecker == teachers.length) {
            System.out.printf("Cannot find any teacher match with teacherId %s, modify teacher for course %s failed.",
                    teacherId, courseId);
        } else if (courseChecker == courses.length) {
            System.out.printf("Cannot find any course match with courseId %s, modify teacher for course %s failed.",
                    courseId, courseId);
        }
    }
}
