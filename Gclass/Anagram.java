package com.Gclass;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {

String str="bcdea";
int count=0;
char[] ar=str.toCharArray();
for (int i=0;i<=str.length()-1;i++){
    for (int j=i+1;j<=str.length()-1;j++){
        char temp=0;
        if (ar[i]>ar[j]){
            ar[i]=ar[j];

        }
    }
}

    }
}
