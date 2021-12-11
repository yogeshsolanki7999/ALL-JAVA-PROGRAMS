package com.practice;

public class Maximum_bw_4_numbers {
    public static void main(String[] args) {
        int obj1=658;
        int obj2=258;
        int obj3=798;
        int obj4=321;
        if (obj1>obj2) {
            if (obj1> obj3) {
                if (obj1> obj4) {
                    System.out.println(" IS THE TOPPER WITH SCORE " + obj1);
                }
                else {
                    System.out.println((obj4 +" IS THE TOPPER WITH SCORE "+ obj4));
                }
            }
        }
        else if(obj2>obj3){
            if(obj2>obj4){
                System.out.println(obj2 +" IS THE TOPPER WITH SCORE "+ obj2);

            }
            else {
                System.out.println(obj4 +" IS THE TOPPER WITH SCORE "+ obj4);
            }
        }
        else if (obj3> obj4){
            System.out.println((obj3 +" IS THE TOPPER WITH SCORE "+ obj3));
        }
        else {
            System.out.println((obj4 +" IS THE TOPPER WITH SCORE "+ obj4));
        }
    }
    }

