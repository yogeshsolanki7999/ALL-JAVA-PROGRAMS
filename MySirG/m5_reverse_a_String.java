package com.MySirG;

import java.util.Scanner;

public class m5_reverse_a_String {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        char [] ar=str.toCharArray();
        for (int i=ar.length-1;i>=0;i--){
            System.out.print(ar[i]);

        }
    }
}
