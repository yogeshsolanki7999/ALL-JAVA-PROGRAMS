package com.GAssignments;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        int [] arrayy={1,2,3,4};

        int [] arr={6,7,8,9};

        int [] arr2=new int[8];
        int count=0;

        int len=arr2.length/2;


        for (int i=0;i<=len-1;i++){
            arr2[i]=arrayy[i];
            count++;
        }

        for (int i=0;i<=len-1;i++){
            arr2[count]=arr[i];
            count++;
        }
        for (int i= 0 ; i<=arr2.length-1;i++){
            System.out.println(arr2[i]);
        }
        }
        }
