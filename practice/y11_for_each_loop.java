package com.practice;

import java.util.Scanner;

public class y11_for_each_loop {

    public static void main(String[] args) {
        int[ ] marks=new int[5];
        Scanner s= new Scanner(System.in);

        for (int i=0;i<=marks.length-1;i++){
            System.out.println("ENTER ELEMENT");
            marks[i]=s.nextInt();
        }
        System.out.println("PRINTING ARRAY ELEMETS USING FOR EACH LOOP");
        for (int element:marks
             ) {
            System.out.println(element);

        }
        System.out.println("PRINTINH ARRAY ELEMTSS USING FOR LOOP");

        for (int j=0;j<=marks.length-1;j++){
            System.out.println(marks[j]);
        }


    }
}
