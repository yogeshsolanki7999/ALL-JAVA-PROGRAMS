package com.Gclass;

public class above10and20wala {
    public static void main(String[] args) {


        int x = 5;
        int y = 6;
        int and = x & y;
        int or = x | y;
        System.out.println("FOR AND OPERATION");
        if (and>10 && and<20){
            System.out.println("IT IS BETWEEN 10 AND 20");
        }
        else{
            System.out.println("it is not between 10 and 20 so printing the value ="+and);
        }

        System.out.println("FOR OR OPERATION");

        if (or>10 && or<20){
            System.out.println("IT IS BETWEEN 10 AND 20");
        }
        else
        {
            System.out.println("it is not between 10 and 20 so printing the value "+or);
        }


    }
}
