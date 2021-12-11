package com.pracrtice_geeks;

import java.util.Locale;

public class P10_pallindrome {
    public static void main(String[] args) {
        String str="nltin";
        int p1=0;
        int p2=str.length()-1;

        while (p1<=p2){
            if (str.charAt(p1)==str.charAt(p2)){
                p1++;
                p2--;
            }
            else {
                System.out.println("not pallindrome");
                break;

            }
            }
        }

    }

