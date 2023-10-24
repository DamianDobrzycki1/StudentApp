package ie.atu;

import java.util.Scanner;
public class Student {
    String studentName;
    String studentEmail;
    String studentCourse;
    public Student(){
        this.studentName = " ";
        this.studentEmail = " ";
        this.studentCourse = " ";
    }

    public Student(String studentName, String studentEmail, String studentCourse) {
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.studentCourse = studentCourse;
    }
    public void getUserInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name");
        this.studentName = scanner.nextLine();

        System.out.print("Enter your email");
        this.studentEmail = scanner.nextLine();
    }

    public void displayInfo() { System.out.println(" " + studentName + " " + studentEmail + " " + studentCourse); }
}
