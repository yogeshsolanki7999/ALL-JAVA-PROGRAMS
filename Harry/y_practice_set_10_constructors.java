package com.Harry;
//PROBLEM 1 CREATE A CYLINDER CLASS AND USE SETTERS AND GETTERS TO SET ITS RADIUS AND HEIGHT
 class cylinder{
     private float radius;
     private float height;

     public void setRadius(float radius){
         this.radius=radius;
     }
     public void setHeight(float height){
         this.height=height;
     }
     public float getRadius(){
         return radius;
     }
     public float getHeight(){
         return height;
     }
     //PROBLEM 2 CALCULATE SURFACE AREA AND VOLUME OF THE CYLINDER
    public  float  surfaceArea(float h,float r){

         float pi=3.14f;

         float result=2*pi*r*h+2*pi*r*r;
        return result;

    }
    public  float  volume(float r,float h){

        float pi=3.14f;

        float result=pi*r*r*h;
    return result;

    }
    //PROBLEM 3 USE CONSTRUCTOR DEFUALT CONSTRUCTOR
    public cylinder(){
         this.height=3.5f;
         this.radius=2.5f;

    }
    //USING  PARAMETERIZED CONSTRUCTOR

public cylinder(float radius,float height){
         this.radius=radius;
         this.height=height;
}

}
public class y_practice_set_10_constructors {
    public static void main(String[] args) {
        cylinder cyl=new cylinder();



        System.out.println("PRINTING THE VALUE OF SURFACEAREA");

      float surfaceArea=  cyl.surfaceArea(cyl.getHeight(), cyl.getRadius());
        float volume =cyl.volume(cyl.getRadius(),cyl.getHeight());
        System.out.println("SURFACE AREA IS =="+surfaceArea);
        System.out.println("volume       IS =="+volume);

        cylinder cyl1=new cylinder(2.5f,3.5f);
        float surfaceArea1=  cyl1.surfaceArea(cyl.getHeight(), cyl.getRadius());
        float volume1 =cyl1.volume(cyl1.getRadius(),cyl1.getHeight());
        System.out.println("SURFACE AREA IS =="+surfaceArea);
        System.out.println("volume       IS =="+volume);


    }
}
