package com.Raja.Oops;
class obj{
    int a,b;
     public void print(int x){
         System.out.println(x);

    }
    public void pirintVar(int a,int b){

         this.b=b;
         this.a=a;
        System.out.println(a);
        System.out.println(b);

    }
}

public class O1_Classes_and_Objects{
    public static void main(String[] args) {
        //THIS IS ANONUMOUS OBJECT CALLING
        new obj().print(5);

        //CREATING MULTIPLE OBJECT IN SAME TIME
        obj o=new obj(),o2=new obj();
        o.pirintVar(4,5);
        o2.pirintVar(6,8);

    }
        }
