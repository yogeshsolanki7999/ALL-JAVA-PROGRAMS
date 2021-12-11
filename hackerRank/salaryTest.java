package com.hackerRank;

import java.util.Scanner;
/*Write a program to calculate the total salary of a person. The user has to enter the basic salary
 (an integer) and the grade (an uppercase character), and depending upon which
  the total salary is calculated as -

totalSalary = basic + hra + da + allow – pf
    where :
hra = 20% of basic

da = 50% of basic

allow = 1700 if grade = ‘A’

allow = 1500 if grade = ‘B’

allow = 1300 if grade = ‘C' or any other character

pf = 11% of basic.

Round off the total salary and then print the integral part only.

Note: Try finding out a function on the internet to do so

Input Format

Basic salary & Grade (separated by space)

Constraints

0 <= Basic Salary <= 7,500,000

Output Format

Total Salary

Sample Input 0

10000 A
Sample Output 0

17600
Sample Input 1

4567 B
Sample Output 1

8762
Sample Input 2

3159 C
Sample Output 2

6323*/

public class salaryTest {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("ENTER YOUR BASIC SALARY");
        float basic = s.nextInt();
        System.out.println("ENTER YOUR GRADE");
        char grade = s.next().charAt(0);
        s.close();
        float total ;
        float hra = ((basic / 100) * 20);
        float da = ((basic / 100) * 50);
        float pf = ((basic / 100) * 11);
        if (basic >= 0 && basic <= 7500000) {
            if (grade == 'A') {
                float allow = 1700;
                total = basic + hra + da + allow - pf;
                System.out.println(Math.round(total));

            } else if (grade == 'B') {
                int allow = 1500;
                total = basic + hra + da + allow - pf;
                System.out.println(Math.round(total));

            } else  {
                int allow = 1300;
                total = basic + hra + da + allow - pf;
                System.out.println(Math.round(total));

            }




        }
        else {
            System.out.println("YOU ENTERED INVALID BASIC SALARY");
        }

    }
}



