package com.Apna_collage;

 class Shape {
     String area = "5";

     public void area() {
         System.out.println(area);
     }
 }

     class Circle extends Shape{
         public void circle(){
             System.out.println(area);
             System.out.println("circle");
         }
     }


public class A4_InheritanceSingleLevel {
    public static void main(String[] args) {
        Circle c=new Circle();
        c.circle();
    }
}
