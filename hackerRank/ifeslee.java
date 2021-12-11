package com.hackerRank;

import java.util.Scanner;

public class ifeslee {

    public static void main(String [] args){

      Scanner s=new Scanner(System.in);
            int n=s.nextInt();

            if(n%2==1){

                System.out.println("Weird1");

            }
            else if(n%2==0 && n>=2 &&n<=5){

                System.out.println(" Not Weird1");

            }
            else if(n%2==0 && n>=2 &&n<=5){

                System.out.println(" Not Weird2");

            }   else if(n%2==0 && n>=6 &&n<=20){

                System.out.println("  Weird2");

            }   else if(n%2==0 &&n>20){

                System.out.println(" Not Weird3");

            }
            else{
                System.out.println("defaoult");
            }
        }
}
