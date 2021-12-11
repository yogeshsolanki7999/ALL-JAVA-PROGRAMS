package com.Gclass;

public class Merge_two_array_sort_also {
    public static void main(String[] args) {


    int arr1[] = {1, 2, 3, 0, 0, 0};
    int arr2[]={2,4,5};
int count=0;

    int temp=0;

    for (int i=0;i<= arr1.length-1;i++){
        if (arr1[i]==0){
            arr1[i]=arr2[count];
            count++;
        }
    }
    for (int i=0;i< arr1.length-1;i++){
        if (arr1[i]>arr1[i+1]){
            temp=arr1[i];
            arr1[i]=arr1[i+1];
            arr1[i+1]=temp;

        }
    }

        for (int el:arr1
             ) {
            System.out.println(el);

        }
}}