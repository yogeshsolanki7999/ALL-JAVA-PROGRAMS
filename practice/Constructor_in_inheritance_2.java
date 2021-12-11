package com.practice;
class parent{
    int a;
parent(){
    System.out.println("i am default constructor of parent");
}
    parent(int a){

        System.out.println("i am a parent parametrized constructor");
        System.out.println(a);
    }
}
class child extends parent{
    int b;
    child(int a,int b){
        super(a);
        System.out.println("i am a child parametrized constructor");
        System.out.println(b);
    }
    child(){
        System.out.println("i am a default of child");
    }
}
class  grandchild extends child{
    grandchild(){

        System.out.println("i am a grandchilds default constructor");
    }
    grandchild(int a,int b,int c){
        super(a,b);
        System.out.println("i am a grandchild parametrized constructor");
        System.out.println(c);
    }
}

public class Constructor_in_inheritance_2 {
    public static void main(String[] args) {
       // child ch=new child();
       // child ch1=new child(4,5);
        grandchild gc=new grandchild(4,5,6);
    }
}
