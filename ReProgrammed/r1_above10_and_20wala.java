package com.ReProgrammed;

import java.util.Scanner;

public class r1_above10_and_20wala {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER NUM1");
        int num1=s.nextInt();
        System.out.println("ENTER NUM1");
        int num2=s.nextInt();
        int AND=num1&num2;
        int OR=num1|num2;

        if (AND>=10 && AND<=20){
            System.out.println("THE VALUE OF AND IS BETWEEN 10 AND 20 AND YHE VALUE IS  "+AND);
        }
        else
        {
            System.out.println("IT DOES NOT LIES BETWEEN A AND B AND ITS VALUE IS  "+AND);
        }
        if (OR>=10 && AND<=OR){
            System.out.println("THE VALUE OF OR IS BETWEEN 10 AND 20 AND YHE VALUE IS  "+OR);
        }
        else
        {
            System.out.println("IT DOES NOT LIES BETWEEN A AND B AND ITS VALUE IS  "+OR);
        }
    }
}
