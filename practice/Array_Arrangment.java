package com.practice;

import java.util.Scanner;

public class Array_Arrangment {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY");
        int [] ar=new int[s.nextInt()];
        int l=ar.length/2;
        int cout1=0;
        int cout2=l+1;
        for (int i=0;i<=ar.length-1;i++){
            ar[i]=s.nextInt();
            if (ar[i]<5){
                ar[cout1]=ar[i];
                cout1++;
            }
            else if (ar[i]==5){
                ar[cout1+1]=ar[i];
            }
            else {
                ar[cout2]=ar[i];
                cout2++;
            }
        }


    }
}
