package com.Harry;
import java.util.Scanner;

public class y3_scanner {
    public static void main(String[] args) {
        System.out.println("ENTER YOUR NAME");
        Scanner s = new Scanner(System.in);
        String name = s.next();

        System.out.println("ENTER YOUR MATHS");
        int marks1 = s.nextInt();
        System.out.println("ENTER YOUR PHYSICS MARKS ");
        int marks2 = s.nextInt();
        System.out.println("ENTER YOUR CHEMESTRY MARKS");
        int marks3 = s.nextInt();
        System.out.println("ENTER YOUR HINDI MARKS");
        int marks4= s.nextInt();
        System.out.println("ENTER YOUR ENGLISH MARKS");
        int marks5 = s.nextInt();
        int total=marks1+marks2+marks3+marks4+marks5;
        float per=total/5;
        System.out.println("YOUR TOTAL MARKS ARE "+total);
        System.out.println("YOUR PERCENTAGE ARE "+per);
    }
}