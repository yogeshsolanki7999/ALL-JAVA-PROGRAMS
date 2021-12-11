package com.Harry;

import java.util.Scanner;

public class y_practice_set_4_conditinals {
    public static void main(String[] args) {
        //problem1==check the program
     /*   int a=10;
        if (a==11){
            System.out.println("i am not 11");
        }
        else {
            System.out.println("i am not 11");
        }*/




        //problem2==check weather a student is pass or fail
        /*  Scanner s=new Scanner(System.in);
        System.out.println("enter your physics marks");
        int physics=s.nextInt();
        System.out.println("enter your chemistry marks");
        int chemistry=s.nextInt();
        System.out.println("enter your maths marks");
        int maths=s.nextInt();
        Float total=(physics+maths+chemistry)/3.0f;
        if (total>=40 && maths>33 && physics>33 && chemistry>33){
            System.out.println("congratulations you are pass");
        }
        else {
            System.out.println("soory you are fail try hard next time");
        }*/




        //problem==3 calculate goverment tax
        /*Scanner s=new Scanner(System.in);
        System.out.println("Enter your income in lakhs per annum");
        float tax=0;
        float income=s.nextFloat();
        if (income<=2.5){
            tax=tax+0;
        }
        else if (income>2.5f && income<=5f){
            tax=tax+0.05f*(income-2.5f);
        }
        else if (income>5.0f && income<=10.0f){
            tax=tax+0.05f*(5.0f-2.5f);
            tax=tax+0.2f*(income-5f);

        }
        else if (income>10.0f){
            tax=tax+0.05f*(5.0f-2.5f);
            tax=tax+0.2f*(10.0f-5f);
            tax=tax+0.03f*(income-10.0f);
        }
        System.out.println("the total tax paid by the employee is=="+tax);*/



        //problem5==To find out day by a given number
        /*Scanner s=new Scanner(System.in);
        int num=s.nextInt();

        switch (num){

            case 1-> System.out.println("MONDAY");
            case 2-> System.out.println("TUESDAY");
            case 3-> System.out.println("WEDNESDAY");
            case 4-> System.out.println("THURSDAY");
            case 5-> System.out.println("FRIDAY");
            case 6-> System.out.println("SATURDAY");
            case 7-> System.out.println("SUNDAY");
            default -> System.out.println("invalid number");}*/



        //problem5==Check weather the yera is leap yera or not  a leap year
        /*  Scanner s=new Scanner(System.in);
        System.out.println("Enter a year");
        int year=s.nextInt();

        if (year%100==0 && year%400==0 ||year%100!=0 &&year%4==0){
            System.out.printf("The year %d is a leap year",year);
        }
        else {
            System.out.println("this year is not a leap year");
        }*/


        //problem6==To find the type of website
        System.out.println("Enter a wensitr withits extension");
        Scanner s=new Scanner(System.in);
        String website=s.nextLine();
        if (website.endsWith(".org")){
            System.out.println("It is an organisational website");
        }
        else if (website.endsWith(".in")){
            System.out.println("This website is an indian website");
        }
        else if (website.endsWith(".com")){
            System.out.println("This website is an commercial website");
        }

















    }
}
