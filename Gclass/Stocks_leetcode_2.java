package com.Gclass;

public class Stocks_leetcode_2 {
    public static void main(String[] args) {
        int []ar={2,1,2,1,0,1,2};
         int min=0;
         int max=0;
         int day=0;
        for (int i=0;i<= ar.length-1;i++)
        {
            if (i!= ar.length-1){
            if (ar[i]<ar[i+1]){
                min=ar[i];
                break;
            }
            }
        }
        for (int j=0;j<=ar.length-1;j++){
            if (ar[j]==min){
                break;
            }
            day++;
        }

        for (int i=day;i<= ar.length-1;i++)
        {

            if (ar[i]>max){
                max=ar[i];
            }
        }
        int pro=max-min;
        if (pro!=0){
            System.out.println(pro);
        }
        else {
            System.out.println(0);
        }

    }
}
