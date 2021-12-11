package com.GAssignments;

public class Stocks {
    public static void main(String[] args) {
        int a[]={7,8,4,3,6};
        int min=a[1];
       int max=0;
int count=0;
        for (int i=0;i<= a.length-1;i++){

            if (a[i]<min){
                min=a[i];
            }
        }
        for (int j=0;j<=a.length-1;j++){
            if (a[j]==min){
                break;
            }
            count++;
        }
        for (int i=count;i< a.length;i++){
            if (a[i]>max){
                max=a[i];
            }

        }

        int profit=max-min;
        if (profit!=0){
            System.out.println(profit);
        }
        else {
            System.out.println(0);
        }



    }
}
