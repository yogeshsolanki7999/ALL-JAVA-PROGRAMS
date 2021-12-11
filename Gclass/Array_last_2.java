package com.Gclass;

public class Array_last_2 {
    public static void main(String[] args) {
        int ar1[]={4,9,5};
        int ar2[]={9,4,9,8,4};
        int count=0;
        int[] cop=new int[ar1.length+ar2.length];

        for (int i=0;i<= cop.length;i++){
            cop[i]=ar1[i];
            count++;
        }
        for (int i=0;i<= cop.length;i++){
            cop[count]=ar2[i];
            count++;
        }
    }
}
