package com.oops;

import java.util.Scanner;

class Animal1{
    String name,color,type;
    int legs;
    Animal1(String name,String color,String type,int legs){
        this.name=name;
        this.color=color;
        this.type=type;
        this.legs=legs;

    }
Animal1(){


}

    Animal1(Animal1 obj,String name){
        this.name=name;
        this.color= obj.color;
        this.type= obj.type;
        this.legs=obj.legs;
    }

    Animal1(String p){
        System.out.println("ENTER THE NAME OF ANIMAL");
        Scanner sc=new Scanner(System.in);
        this.name=sc.nextLine();
        System.out.println("ENTER THE COLOR OF ANIMAL");
        this.color=sc.nextLine();
        System.out.println("ENTER THE TYPE OF ANIMAL");
        this.type= sc.nextLine();
        System.out.println("ENTER THE LEGS OF ANIMAL");
        this.legs= sc.nextInt();


    }

    public void print(){
        System.out.println(name);
        System.out.println(color);
        System.out.println(type);
        System.out.println(legs);
    }


        }

public class O2_constructors {
    public static void main(String[] args) {

        //PRAMETRIZED CONSTRUCTORS
        System.out.println("PARAMETRIZED CONSTRUCTOR");
    Animal1 dog=new Animal1("dog","black","pet",4);
        System.out.println(dog.name);
        System.out.println(dog.color);
        System.out.println(dog.type);
        System.out.println(dog.legs);

        //DEFAULT CONSTRUCTOR
        System.out.println("DEFAULT CONSTRUCTOR");
        Animal1 defaul=new Animal1();
        System.out.println(defaul.color);
        System.out.println(defaul.name);
        System.out.println(defaul.type);
        System.out.println(defaul.legs);

        //COPY CONSTRUCTOR
        System.out.println("COPY CONSTRUCTOR");
        Animal1 cat=new Animal1(dog,"cat");
        System.out.println(cat.name);
        System.out.println(cat.color);
        System.out.println(cat.type);
        System.out.println(cat.legs);


         //TAKING INPUT FROM USER IN CONSTRUCTOR AND PRINTING THROUGH METHOD IN CONSTRUCTOR

        Animal1 crow=new Animal1("p");
        crow.print();

}}
