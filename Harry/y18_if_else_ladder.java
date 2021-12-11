package com.Harry;

import java.util.Scanner;

public class y18_if_else_ladder {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int age = s.nextInt();

        if(age>56){
            System.out.println("YOU ARE AN OLD MAN");
        }
        else if (age>45){
            System.out.println("YOU ARE A  MAN");
        }
        else if (age>21){
            System.out.println("YOU ARE AN ADULT");
        }
        else {
            System.out.println("YOU ARE AN ANIMAL");
        }


        }}
