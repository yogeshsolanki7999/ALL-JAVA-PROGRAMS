package com.Harry;

public class y31_Recursion {
    //factorial (n)=n*n-1......1
    static int  factorial(int n){
        if(n==0 || n==1){
            return 1;
        } else {
            n=n*factorial(n-1);
        }
        return n;
    }


    static int  factorial_loop(int n){
        if(n==0 || n==1){
            return 1;
        }
        else {
            int product = 1;
            for (int i = 1; i <= n; i++) {
                product = product * i;
            }

            return product;}
        }



    public static void main(String[] args) {
        int x=5;

        System.out.println("THE FACTORIAL OF X IS ="+factorial(x));
        System.out.println("THE FACTORIAL OF X IS ="+factorial_loop(x));

    }
}
