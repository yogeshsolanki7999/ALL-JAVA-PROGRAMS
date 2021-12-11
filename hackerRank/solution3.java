package com.hackerRank;

import java.util.Scanner;

class ComplexNumbers{

    int r1,r2,i1,i2;


    ComplexNumbers(int r1,int i1,int r2,int i2){
        this.r1=r1;
        this.i1=i1;
        this.r2=r2;
        this.i2=i2;
    }

    public void plus() {

        int c1 = (r1 + r2);
        int c2 = (i1 + i2);
        c1=c1+c2;



        System.out.println(c1 + " +i" + c2);
    }
    public void multiply(){

        int c1=r1*r2;
        int  c2=i1*i2;

        System.out.println(c1+" +i"+c2);


    }
}

public class solution3 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        ComplexNumbers cn=new ComplexNumbers(s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt());

        if(s.nextInt()==1){

            cn.plus();
        }
        else{
            cn.multiply();
        }




    }
}
