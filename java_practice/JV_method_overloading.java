package com.java_practice;

public class JV_method_overloading {
    public static void main(String[] args) {
         sum(5,60);
    }
    public  static void sum(int a ,int b){
        int c=a+b;
        System.out.println(c);

    }
    public static void sum(int a,int b,int c){
        int d=a+b+c;
        System.out.println(d);
    }
}
