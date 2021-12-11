package com.ReProgrammed;

import java.util.Scanner;

public class r5_Sum_2 {
    public static void main(String[] args) {
        int [] arr=new int[5];
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE VALUES IN ARRAY");
        for (int a=0;a<= arr.length-1;a++){
            arr[a]=s.nextInt();
        }
        System.out.println("ENTER YOUR TARGET VALUE TO CHECK WEATHER SUM OF TWO NUMBERS IN ARRAY IS EQUALS TO TARGET OR NOT");
        int target=s.nextInt();
        boolean tar=false;


        for (int i=0;i<=arr.length-1;i++){
            for (int j=i+1;j<=arr.length-1;j++){
                if (arr[i]+arr[j]==target){
                    System.out.println(arr[i]+"  and "+arr[j]);
                    tar=true;

                }

            }
        }
        if (tar==true){
            System.out.println("ELEMENTS PRSENT IN ARRAY WHOSE SUM IS EQUALS TO TARGET");
        }
        else
            System.out.println("ELEMENTS  IS NOT PRESENT");

    }
}
