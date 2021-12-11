package com.Harry;

public class y25_Array {
    public static void main(String[] args) {
        //First way
        int[] marks=new int[5];
        marks[0]=65;
        System.out.println("FIRST WAY"+marks[0]);

        //second way
        int[] marks1;
        marks1=new int[5];
        marks1[0]=54;
        System.out.println("SECOND WAY"+marks1[0]);

        //Third way
        int[] marks2={45,66,66,54,98,78};
        System.out.println("THIRD WAY"+marks2[0]);
        System.out.println();
        System.out.println("DISPLAYING ELEMENTS USING ARRAY");
        for (int i=0;i<=marks2.length-1;i++){
            System.out.println(marks2[i]);
        }
    }
}
