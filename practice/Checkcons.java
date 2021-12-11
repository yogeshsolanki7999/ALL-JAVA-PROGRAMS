package com.practice;

public class Checkcons {
    public static void main(String[] args) {
        cons car1=new cons();
        System.out.println("PRINTING THE VALUES OF CAR1");
        System.out.println(car1.getName());
        System.out.println(car1.getColor());
        System.out.println(car1.getBodyMetal());
        System.out.println(car1.getModelYear());
        System.out.println(car1.getPlateNo());

        cons car2=new cons("KWID","BLUE","IRON",2017,7789);
        System.out.println("PRINTING THE VALUES OF CAR2");
        System.out.println(car2.getName());
        System.out.println(car2.getColor());
        System.out.println(car2.getBodyMetal());
        System.out.println(car2.getModelYear());
        System.out.println(car2.getPlateNo());
    }
}
