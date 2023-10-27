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
        this.studenBtName = " ";
        this.studentBEmail = " ";
        this.studentBCourse = " ";
    }

    //Constructor
    public Student(String studentName, String studentEmail, String studentCourse) {
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.studentCourse = studentCourse;
    }
    public Student(String studentAName, String studentAEmail, String studentACourse){
        this.studentAName = studentAName;
        this.studentAEmail = studentAEmail;
        this.studentACourse = studentACourse;
    }
    
    public Student(String studentAName, String studentAEmail, String studentACourse){
        this.studentAName = studentAName;
        this.studentAEmail = studentAEmail;
        this.studentACourse = studentACourse;
        
    public void getUserInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name and surname: ");
        this.studentName = scanner.nextLine();

        System.out.print("Enter your email: ");
        this.studentEmail = scanner.nextLine();

        System.out.print("Enter your Course: ");
        this.studentCourse = scanner.nextLine();
    }

    // Default Constructor
    public void displayInfo() {
        System.out.println(" " + studentName);
        System.out.println(" " + studentEmail);
        System.out.println(" " + studentCourse);
    }

    public void displayInfo(){
        System.out.println(" " + studentAName);
        System.out.println(" " + studentAEmail);
        System.out.println(" " + studentACourse);
    }

    public void displayInfo(){
        System.out.println(" " + studentBName);
        System.out.println(" " + studentBEmail);
        System.out.println(" " + studentBCourse);
    }


    //Getters

    public String getStudentName(){
        return studentName;
    }
    public String getStudentEmail(){
        return studentEmail;
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
