package com.Gclass;

import java.util.Scanner;

public class Check_AND_OR {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF NUM1");
    int num1 = s.nextInt();
        System.out.println("ENTER THE VALUE OF NUM2");

        int num2 = s.nextInt();
    int AND = num1 & num2 ;
    int OR= num1 | num2 ;


        System.out.println("THE RESULT OF AND OPERATION IS  "+AND);
        System.out.println("THE RESULT OF AND OPERATION IS  "+OR);








}
}
