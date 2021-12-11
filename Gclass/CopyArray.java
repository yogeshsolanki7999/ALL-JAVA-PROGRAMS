package com.Gclass;

public class CopyArray {
    public static void main(String[] args) {


    int[] arr={1,2,3,9,9,7,6,5};
    int [] cop=new int[8];

        for (int j=0;j<=arr.length-1;j++){
            cop[j]=arr[j];
        }


        for(int el:cop){
            System.out.print(el+" ");
        }


}}
