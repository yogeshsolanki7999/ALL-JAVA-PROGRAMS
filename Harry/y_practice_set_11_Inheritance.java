package com.Harry;
class  circle1{
    float radius;
    float height;


    circle1(float r){
        this.radius=r;
        System.out.println("I AM CIRCLE PARAMETRIED CONSTRUCTOR");

    }
    public double area(){
        double TotalArea=2*Math.PI* this.radius;

        return TotalArea;
    }


}
class cylinder1 extends circle1{
    cylinder1( float r,float h){
        super(r);
        this.height=h;
        System.out.println("I AM CYLINDER PARAMETRIZED CONSTRUCTOR");

    }
    public double area(){
       double TotalArea=2*Math.PI*this.radius*this.height;

       return TotalArea;
    }
    public double volume(){
      double  Totalvolume=Math.PI*this.radius*this.radius*this.height;
      return  Totalvolume;
    }
}

class Rectangle{

}
class cuboid extends  Rectangle{

}

public class y_practice_set_11_Inheritance {
    public static void main(String[] args) {
        //PROBLEM 1
        //circle1 c=new circle1(12);
        cylinder1 cy=new cylinder1(12,16);
        System.out.println(cy.area());
    }
}
