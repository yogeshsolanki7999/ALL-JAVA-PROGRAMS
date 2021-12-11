package com.MySirG;

import org.w3c.dom.ls.LSOutput;

import javax.print.attribute.standard.MediaSizeName;
import java.util.Scanner;

public class m25_find_greater_among_three_numbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER NUMBER1");
        int a=s.nextInt();
        System.out.println("ENTER NUMBER2");
        int b=s.nextInt();
        System.out.println("ENTER NUMBER3");
        int c=s.nextInt();
       if (a>b){
           if (a>c){
               System.out.println("A IS BIG");
           }
           else {
               if (c>b){
                   System.out.println("c is bigger");
               }
           }

       }else {
           if (b>c){
               System.out.println("b is bigger");
           }
           else {
               System.out.println("c is big");
           }
       }

    }
}
