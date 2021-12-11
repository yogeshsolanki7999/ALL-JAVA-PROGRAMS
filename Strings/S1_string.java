package com.Strings;

public class S1_string {
    public static void main(String[] args) {
        //CHECKING STRING IS A ARRAY OF CHARACTER
//        String str="yogesh";
//        System.out.println(str);
//        char[] c=str.toCharArray();
//        for (char el:c
//             ) {
//            System.out.print(el+" ");
//        }
//        System.out.println();
//        String s=new String(c);
//        System.out.println(s);


        //CHECKING FOR STRING IMMUTABLITY
        String str="yogesh";
        str=str.concat("dj");
        System.out.println(str);
        String str1= new String("yog");
        str1="cc";
        System.out.println(str1);
    }
}
