package com.Harry;

public class y_practice_set_9_methods {

    //PROBLEM 1 PRINTING THE TABLE OF NUMBER N USING METHODS
    public static void multiply (int n){

        for(int i=1 ;i<=10;i++){
            int result=0;
            System.out.println(  result=i*n);
        }}
    //PROBLEM 2 PRINTING THE LINES OF PATTERN ACCORDING TO THE USER INPUT OF METHOD
    public static void pattern( int c , int r){
        for (int i=0;i<=c;i++){
            for(int j=0;j<=r;j++){

                if (j<=i){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            } System.out.println();}

    }

    //
    //
    // PROBLEM 3 RECURSON FUNCTION TO CALCULATE SUM OF FIRST N NUMBERS

    public static  int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
    //
    //
    //PROBLEM 4 WRITE A FUNCTION TO PRINT A PATTERN REVERSE OF FIRST PATTERN
    public static void pattern2( int c , int r){
        for (int i=0;i<=r;i++){
            for(int j=0;j<=c;j++){

                if (j<=(5-i)){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            } System.out.println();}
        //
        //
        //PROBLEM 6 WRITE A FI

    }
    public static void main(String[] args) {
        //multiply(5);
        //pattern(6,6);
    /*int result=  sum(5);
        System.out.println(result);*/
        pattern2(5,5);
    }
}


