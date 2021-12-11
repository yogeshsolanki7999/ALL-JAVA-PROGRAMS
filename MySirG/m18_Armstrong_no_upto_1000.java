package com.MySirG;

public class m18_Armstrong_no_upto_1000 {
    public static void main(String[] args) {
        System.out.println("ARMSTRONG NUMBERS ARE:");
       int x;
       int sum;
        int r;
        int cube=0;

        for (int n=0;n<=1000;n++){
             sum=0;
         x=n;
            while (x!=0){


                r=x%10;

                sum=sum+r*r*r;
                x=x/10;
            }
            if (sum==n){
                System.out.println(n);
            }
        }
    }
}
