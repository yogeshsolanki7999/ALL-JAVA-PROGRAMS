package com.ReProgrammed;

import java.util.Scanner;

public class StringArrayOperation {
    public static void main(String[] args) {

        String [] ar=new String[5];
        Scanner s=new Scanner(System.in);
        for (int i=0;i<=ar.length-1;i++){
            System.out.println("ENTER  "+i+" INDEX STRING");
            ar[i]=s.nextLine();
        }

    }
}
