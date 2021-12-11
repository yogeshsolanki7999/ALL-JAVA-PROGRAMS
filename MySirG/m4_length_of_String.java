package com.MySirG;

import java.util.Scanner;

public class m4_length_of_String {
    public static void main(String[] args) {
        int count=0;
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int length =str.length();
        System.out.println(length);
        char[] ar=str.toCharArray();
        for (int i=0;i<=ar.length-1;i++){
            count=count+1;
        }
        System.out.println(count);
    }

}
