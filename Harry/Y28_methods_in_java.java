package com.Harry;

import java.util.Scanner;

public class Y28_methods_in_java {




    static int sum(int x, int y){
        int z=x+y;
     return z;
    }
    public static void main(String[] args) {

        //WITH CREATING VARIABLE AND GIVING IN METHOD

        int a=55;
      int b=66;
      //INVOKING THE METHOD BY OBJECT
        Y28_methods_in_java obj=new Y28_methods_in_java();
      int c1=obj.sum(a,b);
        System.out.println(c1);

        //WITH DIRECT GIVING THE VALUES
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER I");
        int i= s.nextInt();
        System.out.println("ENTER J");
        int j= s.nextInt();
        int c2=sum(i,j);
        System.out.println(c2);


            System.out.println( obj.sum(55,66));


    }
}

