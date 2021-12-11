package com.ReProgrammed;

import java.util.Scanner;

public class r4_marks {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER YOUR MARKS");
        int marks=s.nextInt();

      if(marks<=100 && marks>=90){
          System.out.println("YOUR GRADE IS A+");
      }
      else if(marks<90 && marks>=80){
          System.out.println("YOUR GRADE ISA A");
      }
      else if(marks<80&&marks>=60){
          System.out.println("YOUR GRADE IS B");

      }
      else if (marks<60&&marks>=40){
          System.out.println("YOUR GRADE IS C");
      }
      else if (marks<40){
          System.out.println("YOU ARE FAIL ");
      }
      else
      {
          System.out.println("YOU ENTERED IVALID MARKS VALUE PLEASE CHECK AND RETRY");
      }

    }
}
