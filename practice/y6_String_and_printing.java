package com.practice;

import java.util.Locale;

public class y6_String_and_printing {
    public static void main(String[] args) {
        // 1 Ways of  initializing String
       //String name;
        //name="Suhani nakul";
        //System.out.println(name);

        // 2 Ways of  initializing String
        //String str="pari shikha";
        //System.out.println(str);

        // 3 Ways of initializing String
        //String str1=new String("yogesh nikita");
        //System.out.println(str1);



         /*
        //An example to undersatnd the String pool and String objects

        String str1="yogesh";
        String str2="yogesh";
        System.out.println(str1==str2);
        String s1=new String("solanki");
        String s2=new String("solanki");
        System.out.println(s1==s2);
        */


        //Methods pf String

        String s=new String("YOGESH solanki ");
        System.out.println(s.length());
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.trim());
        System.out.println(s.substring(3));
        System.out.println(s.substring(3,8));
        System.out.println(s.replace('Y','r'));
        System.out.println(s.startsWith("YO"));
        System.out.println(s.endsWith(" "));
        System.out.println(s.charAt(4));
        System.out.println(s.indexOf("sola"));
        System.out.println(s.indexOf('s',6));
        System.out.println(s.lastIndexOf('s'));
        System.out.println(s.lastIndexOf('s',9));
        System.out.println(s.equals("yogesh"));
        System.out.println(s.equalsIgnoreCase("yogesh solanki "));





    }
}
