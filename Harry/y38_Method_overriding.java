package com.Harry;
class A{
    public int yogi(){
        return 5;
    }

    public void meth1(){
        System.out.println("I AM AMETHOD OF CLASS A");
    }
}

class B extends A{
    @Override
    public void meth1(){
        System.out.println("I AM A METHOD OF CLASS B");
    }
}
public class y38_Method_overriding {
    public static void main(String[] args) {
        A a=new A();
        a.meth1();
        B b=new B();
        b.meth1();
    }
}
