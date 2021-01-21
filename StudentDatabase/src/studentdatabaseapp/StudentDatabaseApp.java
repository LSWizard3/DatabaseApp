package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {


    public static void main(String[] args) {


        System.out.println("Enter number of new students to enroll: ");
        Scanner keyboard = new Scanner(System.in);

        int numOfStudents = keyboard.nextInt();
        Student[] students = new Student[numOfStudents];


        for(int i=0; i < numOfStudents; i++){
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
        }

        for(int i=0; i < numOfStudents; i++){
            System.out.println(students[i].showInfo());

        }








    }


















}
