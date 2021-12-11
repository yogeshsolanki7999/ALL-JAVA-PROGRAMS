package com.hackerRank;

import java.util.Scanner;

public class solution1 {
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        char []arr=str.toCharArray();

        for(int i=0;i<arr.length-1;i++){

                if (arr[i]==arr[i+1]){
                    arr[i+1]++;
                    continue;
                }
                else {
                    System.out.print(arr[i]);
                }


        }
    }
}
