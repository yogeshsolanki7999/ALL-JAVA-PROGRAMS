package com.pracrtice_geeks;

public class P1_swap {
    public static void main(String[] args) {
        int a=4 , b=6;
        System.out.printf("a = %d  and b=%d",a,b);
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.printf("\na = %d  and b=%d",a,b);

    }
}
