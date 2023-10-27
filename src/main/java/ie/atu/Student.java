package ie.atu;

import java.util.Scanner;
public class Student {
     String studentName;
     String studentEmail;
     String studentCourse;
     String studentAName;
     String studentAEmail;
     String studentACourse;
     String studentBName;
     String studentBEmail;
     String studentBCourse;


    
    public Student(){
        this.studentName = " ";
        this.studentEmail = " ";
        this.studentCourse = " ";
        this.studentAName = " ";
        this.studentAEmail = " ";
        this.studentACourse = " ";
    }

    //Constructor
    public void setStudent(String studentName, String studentEmail, String studentCourse) {
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.studentCourse = studentCourse;
    }
    public void setStudentA(String studentAName, String studentAEmail, String studentACourse){
        this.studentAName = studentAName;
        this.studentAEmail = studentAEmail;
        this.studentACourse = studentACourse;
    }
    public void setStudentB(String studentBName, String studentBEmail, String studentBCourse){
        this.studentBName = studentBName;
        this.studentBEmail = studentBEmail;
        this.studentBCourse = studentBCourse;
    }

    public void getUserInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name and surname: ");
        this.studentName = scanner.nextLine();

        System.out.print("Enter your email: ");
        this.studentEmail = scanner.nextLine();

        System.out.print("Enter your Course: ");
        this.studentCourse = scanner.nextLine();

        System.out.print("Enter your name and surname: ");
        this.studentAName = scanner.nextLine();

        System.out.print("Enter your email: ");
        this.studentAEmail = scanner.nextLine();

        System.out.print("Enter your Course: ");
        this.studentACourse = scanner.nextLine();

        System.out.print("Enter your name and surname: ");
        this.studentBName = scanner.nextLine();

        System.out.print("Enter your email: ");
        this.studentBEmail = scanner.nextLine();

        System.out.print("Enter your Course: ");
        this.studentBCourse = scanner.nextLine();
    }

    // Default Constructor
    public void displayInfo() {
        System.out.println(" " + studentName);
        System.out.println(" " + studentEmail);
        System.out.println(" " + studentCourse);
    }
    public void displayInfoA(){
        System.out.println(" " + studentAName);
        System.out.println(" " + studentAEmail);
        System.out.println(" " + studentACourse);
    }
    public void displayInfoB(){
        System.out.println(" " + studentBName);
        System.out.println(" " + studentBEmail);
        System.out.println(" " + studentBCourse);
    }

    //Getters

    public String getStudentName(){
        return studentName;
    }
    public String getStudentEmail(){
        return studentName;
    }
    public String getStudentCourse(){
        return studentCourse;
    }
    //Setters
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    public void setStudentEmail(String studentEmail){
        this.studentEmail = studentEmail;
    }
    public void setStudentCourse(String studentCourse){
        this.studentCourse = studentCourse;
    }

}
