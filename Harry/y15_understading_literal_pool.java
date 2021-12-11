package com.Harry;

public class y15_understading_literal_pool
{
    public static void main(String[] args) {
        String str1="yogesh";
        String str2="yogesh";
        System.out.println(str1==str2);

        String str3=new String("solanki");
        String str4=new String("solanki");
        System.out.println(str3==str4);
    }
}
