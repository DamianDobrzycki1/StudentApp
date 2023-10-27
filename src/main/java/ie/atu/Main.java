package ie.atu;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Student user = new Student();

        user.getUserInput();
        user.displayInfo();
        user.displayInfoA();
        user.displayInfoB();
    }
}