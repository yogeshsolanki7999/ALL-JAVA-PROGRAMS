package com.Gclass;

public class Two_Condition {
    public static void main(String[] args) {


    int [] num={1,2,3,1};
    int k=3;
    boolean flag=false;
    for (int i=0;i<=num.length-1;i++){
        for (int j=0;j<=num.length-1;j++){

            if (i==j) {
                continue;
            }else
            {
                if (num[i]==num[j] && Math.abs(i-j)<=k);
                flag=true;

            }
        }

    }
        if (flag==true){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
}}
