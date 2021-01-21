package studentdatabaseapp;

import java.util.Scanner;

public class Student {


    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = null;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;








    // Constructor: Prompt user to enter student's name and year


    public Student(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = keyboard.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = keyboard.nextLine();

        System.out.println("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = keyboard.nextInt();


        setStudentID();





    }

    // Generate an ID

    private void setStudentID(){
        // Grade level + ID
        id++;
       this.studentID = gradeYear + "" + id;
    }

    // Enroll in courses

    public void enroll(){
        //Get inside loop and exit when hits 0

        do{
            System.out.print("Enter course to enroll(Q to quit): ");
            Scanner keyboard = new Scanner(System.in);
            String course = keyboard.nextLine();
            if(!course.equals("Q")){
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else{
                break;
            }
        }while( 1 != 0);



    }

    /// View balance

    public void viewBalance() {

        System.out.println("Your balance is: $" + tuitionBalance);
    }


    // PAy Tuition


    public void payTuition(){
        viewBalance();
        System.out.print("Enter your payment: $" );
        Scanner keyboard = new Scanner(System.in);
        int payment = keyboard.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }


    //Show status

    public String showInfo(){
        return "Name: " + firstName + " " + lastName +
                "\nGrade Level: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled:" + courses +
                "\nBalance: $" + tuitionBalance;
    }















}
