package com.oops;
class checkStatic{
    int a,b;
    static int c;

     public checkStatic(){
         c++;

    }

    public static void fun(){
        System.out.println("STATIC METHOD");

    }
    public void sum(){
        System.out.println("NON STATIC METHOD");
    }




}

public class Static_keyword {
    public static void main(String[] args) {
        checkStatic c=new checkStatic();
        checkStatic v=new checkStatic();
        checkStatic vd=new checkStatic();



        System.out.println(c.a);
        System.out.println(c.b);
        System.out.println(checkStatic.c);

        
    }
}
