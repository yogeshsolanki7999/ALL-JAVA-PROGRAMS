package com.oops;

import java.util.Scanner;

class employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
}

class cellphone{

    public void ring(String num){
        long number=0 ;
        int count=0;

        for (int i=0;i<=num.length()-1;i++) {
            if (Character.isDigit(num.charAt(i))) {
                count++;
                if (count==10){
                    System.out.println("RINGING");
                    cellphone c=new cellphone();
                    c.vibrate();
                }
            }
            else {
                System.out.println("INVALID NUMBER");
                break;
            }
        }

    }
    public void vibrate(){
        System.out.println("VIBTRATE......");
    }
}

public class practice_questionss {
    public static void main(String[] args) {


        cellphone c = new cellphone();

        c.ring("7999894155");
    }
}
