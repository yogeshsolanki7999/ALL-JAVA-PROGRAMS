package com.Gclass;

import java.util.Scanner;

public class AvarrageArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int [] arr=new int[6];
        System.out.println("ENTER THE VALUES ARRAY");
        for (int i=0;i<=arr.length-1;i++){
            arr[i]=s.nextInt();
        }
        double sum=0;
        for (int i=0;i<=arr.length-1;i++){
            sum=sum+arr[i];
        }
        double result=sum/ arr.length;
        System.out.println(result);
    }
}
