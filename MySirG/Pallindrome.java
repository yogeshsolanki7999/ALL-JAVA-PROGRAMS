package com.MySirG;
import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER");
        int num=s.nextInt();
        int t=num;
        int rev=0;
        for (int i=0;num>0;i++){

            int r=num%10;

            rev=rev*10+r;
            num=num/10;
        }
        if (rev==t){
            System.out.println("NUMBER IS PALLINDROME");
        }
        else {
            System.out.println("NUMBER IS NOT PALLINDORME");
        }
    }
}
