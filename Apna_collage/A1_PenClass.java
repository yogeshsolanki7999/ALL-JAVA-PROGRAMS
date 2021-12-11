package com.Apna_collage;
class Pen{
    String type;
    String color;

    public void printColor(){
        System.out.println(type);

    }
    public void printTye(){
        System.out.println(color);
    }
}
public class A1_PenClass {
    public static void main(String args[]){
Pen p1=new Pen();
p1.color="blue";
p1.type="gell";
p1.printColor();
p1.printTye();

Pen p2=new Pen();
p2.type="ball";
p2.color="red";
p2.printTye();
p2.printColor();



    }
}
