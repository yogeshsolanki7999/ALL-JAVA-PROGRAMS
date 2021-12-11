package com.practice;

import java.util.Locale;
import java.util.Scanner;

public class y7_Exercise2_chapter_3 {
    public static void main(String[] args) {
        String str=new String(" YOGESH  solanki ");

       /* //Convert a string into lower case
        System.out.println(str.toLowerCase());
         */


       /* //Replace spaces with unserscore
        System.out.println(str.replace(" ","_"));
        */


       /* //Fill the letter template book
        String letter="\" Dear <|Name|> ,Thanks alot \"";
        System.out.println(letter.replace("<|Name|>","Yogesh"));
        */


        /*//To detect double and triple spaces
        String s="  yogesh   solanki  ";
        System.out.println(s.indexOf("  "));
        System.out.println(s.indexOf("   "));
        */


        //To reverse String
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a string to reverse");
        String input=s.nextLine();
        System.out.println("Your String is  "+input);
        String empty="";
        char[] ar=input.toCharArray();
        for(int i=input.length()-1;i>=0;i--){
            empty=empty+ar[i];


        }
        System.out.println("Reverse string is  "+empty);


    }
}
