package ie.atu;

import java.util.Scanner;
public class Student {
    String studentName;
    String studentEmail;
    String studentCourse;
    public Student(){
        this.studentName = "";
        this.studentEmail = "";
        this.studentCourse = "";
    }

    public Student(String studentName, String studentEmail, String studentCourse) {
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.studentCourse = studentCourse;
    }
}
