package com.Gclass;

public class Array_last_3 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int count=0;

        int cop[]=new int[a.length];

        for (int i=0;i<a.length;i++){
            cop[count]=a[a.length-1-i];
            count++;
        }
        for (int el:cop
             ) {
            System.out.println(el);
        }
    }
}
