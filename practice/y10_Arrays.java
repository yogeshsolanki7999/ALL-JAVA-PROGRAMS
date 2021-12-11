package com.practice;

import java.util.Scanner;

public class y10_Arrays {
    public static void main(String[] args) {
        //1 WAY OF DECLARING ARRAY
         //int [] marks;
         //marks=new int[5];


         //2 WAY OF DECLARING ARRAY
        int [] marks1=new int[100];
        System.out.println(marks1.length);

        //3 WAY OF DCLARING ARRAY
        //int[] marks2={5,6,8,9,4};


        //GIVING VALUES OF INDEX USING ONE BY ONE METHOD
        //marks[0]=5;
        //marks[1]=6;
        //marks[2]=7;
        //marks[3]=8;
        //marks[4]=9;

       /* //GIVING VALUES OF INDEX USING LOOP METHOD
        Scanner s=new Scanner(System.in);
        for (int i=0;i<=marks1.length-1;i++){
            System.out.println("ENTER THE VALUE OF "+ i+ " INDEX");
            marks1[i]=s.nextInt();
        }
        for (int j=0;j<=marks1.length-1;j++){
            System.out.println( "VALUE OF INDEX "+j+" IS "+marks1[j]);
        }*/





    }
}
