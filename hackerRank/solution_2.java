package com.hackerRank;

import java.util.Scanner;

public class solution_2 {

    public String reverse(String str){
        char[] ch=str.toCharArray();
        String em="";
        for (int i=ch.length-1;i>=0;i--){
            em=em+ch[i];
        }
        return em;
    }

    public static void main(String[] args) {


solution_2 sl=new solution_2();
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String[] ar=str.split(" ");
    String ans="";
    for (int i=ar.length-1;i>=0;i--){
        ans=ans+sl.reverse(ar[i]);
        ans=ans+" ";
    }
        System.out.println(ans);

}}
