package com.ReProgrammed;

import java.util.Locale;

public class panagram {

    public  boolean pan(String str) {
        str = str.toLowerCase();

        for (char i = 'a'; i <= 'z'; i++) {
            String ch = String.valueOf(i);

            if (str.contains(ch)) {
                continue;
            } else {
                return false;

            }
        }
        return true;
    }



    public static void main(String[] args) {
        panagram p=new panagram();
        String str1="abcdefghIjklmnopqrstuvwxyz";
        if (p.pan(str1)){
            System.out.println("STRING PANAGRAM HE");
        }
        else{
            System.out.println("STRING PANAGRAM NAHI HE");
        }
}}
