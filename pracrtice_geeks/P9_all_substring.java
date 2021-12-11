package com.pracrtice_geeks;

public class P9_all_substring {
    public static void main(String[] args) {
        String str="abcbcac";
        for (int i=0;i<=str.length()-1;i++){
            System.out.println("String of "+str.charAt(i)+" is -:");
            for (int j=i+1;j<=str.length();j++){
                System.out.println(str.substring(i,j));
            }


        }
    }
}
