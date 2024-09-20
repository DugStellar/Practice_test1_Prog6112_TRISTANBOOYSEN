package org.example;

public class Student {
    private int studentID;
    private CollegeCourse[] courses;

    public Student(int studentID) {
        this.studentID = studentID;
        this.courses = new CollegeCourse[5];
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public CollegeCourse getCourses(int index) {
        return courses[index];
    }

    public void setCourse(int index, CollegeCourse course) {
        courses[index] = course;
    }
}
