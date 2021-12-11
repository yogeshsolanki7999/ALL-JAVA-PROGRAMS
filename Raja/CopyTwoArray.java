package com.Raja;

public class CopyTwoArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int arr2[]={5,6,7,8};
        int lenth=arr.length  +  arr2.length;
        int[] copy=new int[lenth];
        int count=0;

        for (int i=0;i<arr.length;i++){
            copy[i]=arr[i];
            count++;
        }


        for (int i=0 ;i< arr2.length;i++){
            copy[count]=arr2[i];
            count++;
        }


        for (int item:copy
             ) {
            System.out.println(item);
        }
    }
}
