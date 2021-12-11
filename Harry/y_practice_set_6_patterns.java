package com.Harry;

public class y_practice_set_6_patterns {

    public static void main(String[] args) {
    //Patern1
        // for (int r=1;r<=5;r++){
        /*for (int c=1;c<=5;c++){
            if (c<=r){
            System.out.print("*");
        }
            else {
                System.out.print(" ");

            }
        }
        System.out.println();
    }*/


       /* //pattern2
        for (int r=1;r<=5;r++){
        for (int c=1;c<=5;c++){
            if (c>=6-r){
            System.out.print("*");
        }
            else {
                System.out.print(" ");

            }
        }
        System.out.println();
    }

        */


        //pattern3

       /* for (int c=1;c<=5;c++){
            for (int r=1;r<=5;r++){
                if (r>=c){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");

                }
            }
            System.out.println();
        }*/


        //pattern4
       /* for (int c=1;c<=5;c++){
            for (int r=1;r<=5;r++){
                if (c<=6-r){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");

                }
            }
            System.out.println();
        }*/



        //pattern5
        for (int i=1;i<=5;i++){
        for(int j=1;j<=9;j++){
            if (j>=6-i && j<=4+i){
                System.out.print("*");
            }else {
                System.out.print(" ");
            }

        }System.out.println();}


}}
