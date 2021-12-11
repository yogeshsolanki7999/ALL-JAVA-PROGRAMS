package com.ReProgrammed;

import java.util.Scanner;

public class wipro {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int appId=s.nextInt();
        int sum=0;
        int num=0;
        if (appId>=0 && appId<=Math.pow(10,9)){

            while (appId!=0){
                num=appId%10;

                sum=sum+num;
                appId=appId/10;

            }

        }
        //2656
        //2+6+5+6

        if (sum<=26){
            int count=0;
            for (char i='A';i<='Z';i++){
                count++;
                if (sum==count){
                    System.out.println(i);
                    break;
                }
            }
        }else {
            System.out.println("THE appId IS NOT IN ALPHABETIC RANGE");
        }
    }
}
