package com.Harry;

import java.util.Scanner;

public class y_practice_set_3_string {
    public static void main(String[] args) {
        //PROBLEM 1 = CONVERT THE STRING INTO LOWER CASE
        //String STR1="MY NAME IS YOGESH SOLANKI";
        //System.out.println(STR1.toLowerCase());

        //PROBLEM 2 = FILL THE NAME IN LETTER BOX;
        //String str2="Dear <|name|>,Thanks alot";
        //System.out.println(str2.replace("<|name|>","yogesh"));

        //problem3==To detect the double spaces and triple spaces;
        //String t="my  name   is yogesh solanki";
        //System.out.println(t.indexOf("  "));
        //System.out.println(t.indexOf("   "));

        //problem4==TO replace spaces with underscores
        //String s="my name is yogesh solanki and i am a cse strudent";
        //System.out.println(s.replace(' ','_'));

        //problem5==use of escape sequence in a String by word
        //System.out.println("Dear \"harry\" , this java course is amazing");

        //problem6== Reverse a string using a loop
        Scanner s=new Scanner(System.in);
        System.out.println("enter a String");
        String input=s.nextLine();
        System.out.println("your String is== "+input);
        String empty="";
        int length=input.length();
        char[] ar=input.toCharArray();
        for (int i=length-1;i>=0;i--)
        {
       empty=empty+ar[i];
        }
        System.out.println(empty);
    }
}
