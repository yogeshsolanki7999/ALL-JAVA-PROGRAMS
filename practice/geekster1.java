package com.practice;

public class geekster1 {
    public static void main(String[] args) {

    int max=0;
    //TO FING THE GREATEST NUMBER IN AN ARRAY
    int [] arr={7,8,9,2,6,81,0};

    for(int i=0;i<=arr.length-1;i++){
        int element=arr[i];
        if(element>max){
            max=element;
        }
    }
        System.out.println(max);

    // TO FIND MINIMUM

}}
