package com.Gclass;

public class Constructor2 {
    public static void main(String[] args) {
        Dog d=new Dog(4,"hitus","blackk");
        System.out.println(d.breed);
        System.out.println(d.legs);
        System.out.println(d.color);
        d.bark();

    }
}


class Dog{
    public int legs;
    public String breed,color;
    public  Dog(int legs,String breed,String color){
        this.legs=legs;
        this.breed=breed;
        this.color=color;

    }
    public void bark
            (){
        System.out.println("BHOO BHOO BHAU BHAU");
    }

}
