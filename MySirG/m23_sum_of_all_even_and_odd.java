package com.MySirG;

import javax.swing.*;
import java.util.Scanner;

public class m23_sum_of_all_even_and_odd {
    public static void main(String[] args) {
        int sumE=0;
        int sumO=0;
        Scanner s=new Scanner(System.in);
        int num[]=new int[10];
        System.out.println("ENTER 10 NUMBERS");
        for (int i=0;i<=num.length-1;i++){
            num[i]=s.nextInt();
        }
        for (int j=0;j<=num.length-1;j++){
            if (num[j]%2==0){
                sumE=sumE+num[j];
            }
            else {
                sumO=sumO+num[j];
            }
        }
        System.out.println("SUM OF EVEN NUMBERS OF ARRAY IS ="+sumE);
        System.out.println("SUM OF ODD NUMBERS OF ARRAY IS ="+sumO);


} }
