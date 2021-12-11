package com.Gclass;

public class Array_last_1 {
    public static void main(String[] args) {
        int arr[]={1,3,4,5};
        int target=4;

        for (int i=0;i<=arr.length-1;i++){

            if (arr[i]==4){
                arr[i]=0;
            }
        }

        for (int el:arr
             ) {
            System.out.println(el);
        }
    }
}
