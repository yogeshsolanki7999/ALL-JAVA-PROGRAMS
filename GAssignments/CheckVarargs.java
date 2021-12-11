package com.GAssignments;

public class CheckVarargs {

    public static int var(int...args){
        int sum=0;
        for (int elements:args
             ) {
            sum=sum+elements;

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(var(5,6,5,4,84,65,66));

    } }