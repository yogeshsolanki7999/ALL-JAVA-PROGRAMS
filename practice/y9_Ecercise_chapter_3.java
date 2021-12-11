package com.practice;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class y9_Ecercise_chapter_3 {
    public static void main(String[] args) {

       /* //PRINT GRADES OF THE STUDENTS
        System.out.println("Enter your marks");
        Scanner s=new Scanner(System.in);
        float marks =s.nextFloat();

        if (marks>=90 && marks<=100){
            System.out.println("your grade is A+");
        }
        else if (marks>=70 && marks<90){
            System.out.println("your grade is A");

        }
        else if (marks>=50 && marks<70){
            System.out.println("your grade is B");

        }
        else if (marks>=40 && marks<50){
            System.out.println("your grade is C");

        }
        else if (marks>=33 && marks<40){
            System.out.println("your grade is C");

        }
        else {
            System.out.println("you Entered invalid number");
        }*/


       /* //WRITE A PROGRAM TO FIND OUT A SSTUDENT IS PAAS OR FAIL TOTAL GRADES PERCENTAGE SHOULD BE 40% AND 33 IN EACH SUBJECT

        Scanner s= new Scanner(System.in);
        System.out.println("Entered your maths marks");
        float maths=s.nextFloat();

        System.out.println("Entered your hindi marks");
        float hindi=s.nextFloat();

        System.out.println("Entered your english marks");
        float english=s.nextFloat();

        float total=(maths+hindi+english)/3;
        if(total>=40 && maths>=33 && hindi>=33 && english>=33){
            System.out.printf("CONGRATULATIONS YOU ARE PASS WITH %f PERCENTAGE",total);
        }
        else{
            System.out.printf(" SORRY YOU ARE FAIL WORK HARD NEXT TIME ");
        }*/


       /* //TO PRINT WEEKDAY BY IT NUMBER
        Scanner s= new Scanner(System.in);
        System.out.println("Enter number of day");
        int day=s.nextInt();

        switch (day){

            case 1-> System.out.println("IT'S  MONDAY");
            case 2-> System.out.println("IT'S  TUESDAY");
            case 3-> System.out.println("IT'S  WEDNESDAY");
            case 4-> System.out.println("IT'S  THURSDAY");
            case 5-> System.out.println("IT'S  FRIDAY");
            case 6-> System.out.println("IT'S  SATURDAY");
            case 7-> System.out.println("IT'S  SUNDAY");
        }*/


        /*//WRITE A PROGRAM TO FIND THE TYPE OF THE WEBSITE BY URL USING IF-ELSE
        System.out.println("Enter a website");
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();

        if (str.endsWith(".com") ||str.endsWith(".COM")){
            System.out.println("IT IS A COMMERCIAL WEBSITE");
        }
       else if (str.endsWith(".in")||str.endsWith(".IN")){
            System.out.println("IT IS AN INDIAN WEBSITE");
        }
        else if (str.endsWith(".ORG")||str.endsWith("org")){
            System.out.println("IT IS AN ORGANIZATIONAL WEBSITE");
        }*/

        /*//LEAP YEAR OR NOT\
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a year to check weather it is a leap year or not");
        int year = s.nextInt();

        if (year%400==0||year%4==0&&year%100!=0){
            System.out.println("ITS A LEAP YEAR");
        }
        else {
            System.out.println("ITS NOT A LEAP YEAR");
        }*/

        //TO CALCULATE GOVERMENT TAX
        Scanner s = new Scanner(System.in);
        float income=s.nextFloat();
        float tax =0;

        if (income<2.5f){
            tax=tax+0;
        }
        else if (income>2.5f && income<=5.0f ){
            tax=tax+0.05f*(income-2.5f);
        }
        else if (income>5.0f && income<=10.0f){
            tax=tax+0.05f*(5.0f-2.5f);
            tax=tax+0.2f*(income-5.0f);
        }
        else if (income>10.0f){
            tax=tax+0.05f*(5.0f-2.5f);
            tax=tax+0.2f*(10.0f-5.0f);
            tax=tax+0.3f*(income-10.0f);
        }
        System.out.println("the total tax paid by the employee is=="+tax);



    }
}
