package com.practice;

import java.util.Scanner;

public class y8_conditions {
    public static void main(String[] args) {
       /* //IF ELSE
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a");
        int a=s.nextInt();
        System.out.println("Enter b");
        int b=s.nextInt();
        if (a>=b){
            System.out.printf("%d is greater than %d",a,b);
        }
        else {
            System.out.printf("%d is greater than %d",b,a);
        }*/


        /*//SWITCH CASE
        System.out.println("Enter any operator");
      Scanner s=new Scanner(System.in);

      char c=s.next().charAt(0);

        System.out.println();
        int a=5;
        int b=6;

        switch (c){
            case '+':
                System.out.println(a+b);
                break;

            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("invalid operator");
                break;
        }*/





    //INHANCED SWITCH CASE
        System.out.println("Sir please give a order");
    Scanner s=new Scanner(System.in);
    String order = s.nextLine();
    String flavour =s.nextLine();

    switch (order){
        case "pizza" -> {
            if (flavour=="onion"){
                System.out.println("rate ois 5");
            }
        }

        case "burger" -> System.out.println("you ordered burger and its rate is 50RS");
        case "cofee" -> System.out.println("you ordered cofee and its rate is 20RS");
        case "tea" -> System.out.println("you ordered tea and its rate is 10RS");
        case "garlic bread" -> System.out.println("you ordered garlic bread and its rate is 150RS");
        default -> System.out.println("This item is not available in our menu");
    }
}}
