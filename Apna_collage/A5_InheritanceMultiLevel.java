package com.Apna_collage;
class Shape2{
    final double pie=3.14;
    double radius;
    public void print(){
        System.out.println("class shape");
    }
}

class Circle1 extends Shape2{
    double radius;

    public double area(){
        return pie*radius*radius;
    }

}

class Circle2 extends Circle1{

    public double circum(){
        return 2*pie*radius;
    }
}

public class A5_InheritanceMultiLevel {
    public static void main(String[] args) {
        Circle2 c=new Circle2();
        c.radius=2.1;
        System.out.println( c.area());
        System.out.println(c.circum());

    }

}
