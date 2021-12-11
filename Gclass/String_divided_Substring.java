package com.Gclass;

public class String_divided_Substring {
    public static void main(String[] args) {


    String str="aaabbbccc";
    int n=3;
  String s1=str.substring(0,n);
  String s2=str.substring(n+1,7);
  String s3=str.substring(6,str.length());

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

}}
