package com.oops;

class A{
    int id;
    String name;
    int age;

    A(){

        System.out.println(" DEFAULT CONSTRUCTOR OF CLASS A");
    }

    A(int i){
        System.out.println(" ONE PARAMETER CONSTRUCTOR IN CLASS A");

    }

    A(int i,String name){
        super();
        System.out.println(" TWO PARAMETER CONSTRUCTOR ");

    }

    A(int i,String name,int h){

        System.out.println("THREE PARAMETER CONSTRUCTOR");
    }

}
class B extends A{

    B(){
        super(5,"yo");
        System.out.println("DEFAULT COSNSTRUCTOR OF CLASS B");
    }

    B(int i,String name,int h){

        System.out.println("THREE PARAMETER CONSTRUCTOR");

    }

}
public class Constructor_Chaining {
    public static void main(String[] args) {
        B obj=new B();

    }
}
