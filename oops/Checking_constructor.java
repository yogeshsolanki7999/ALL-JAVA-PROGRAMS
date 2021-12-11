package com.oops;
class parent1{
    int x;


    public parent1(int a){
        System.out.println("construcctor");
        this.x=a;
    }
}

public class Checking_constructor {
    public static void main(String[] args) {
        parent1 p=new parent1(5);
    }
}
