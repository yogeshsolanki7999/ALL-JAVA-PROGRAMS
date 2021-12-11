package com.oops;

import java.util.Scanner;

class animal{
    int legNo,teethCount;
    String name,breed,color;
animal(){
    System.out.println(" CONSTRUCTOR OF ANIMAL");
}
}

class dog extends animal{
    public dog(int legNO,int teeth,String name,String breed,String color){
        this.legNo=legNO;
        this.teethCount=teeth;
        this.name=name;
        this.breed=breed;
        this.color=color;

    }
    public void bark(){
        System.out.println("bhooo bhoo");
    }
    dog(){
        System.out.println(" constructor of dog ");
    }

}
class cat extends dog{
    public cat(int legNO,int teeth,String name,String breed,String color){
       super(legNO,teeth,name,breed,color);
        this.legNo=legNO;
        this.teethCount=teeth;
        this.name=name;
        this.breed=breed;
        this.color=color;

    }
    cat(){
        System.out.println("ENTER THE VALUES OF CAT OBJECT");
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NAME");
        this.name=sc.nextLine();
        System.out.println("ENTER BREED");
        this.breed=sc.nextLine();
        System.out.println("ENTER COLOR");
        this.color=sc.nextLine();
        System.out.println("ENTER LEGNO");
        this.legNo= sc.nextInt();
        System.out.println("ENTER TEETHCOUNT");
        this.teethCount=sc.nextInt();

    }
    public void voice(){
        System.out.println("meow ,meow");
    }

}

public class inheritance {
    public static void main(String[] args) {
//        cat c=new cat(4,35,"pussy","tom","black");
//        System.out.println(c.name);
//        System.out.println(c.breed);
//        System.out.println(c.color);
//        System.out.println(c.legNo);
//        System.out.println(c.teethCount);
//        dog d=new dog(4,35,"tommy","german shephered","orange");
//        System.out.println(d.name);
//        System.out.println(d.breed);
//        System.out.println(d.color);
//        System.out.println(d.legNo);
//        System.out.println(d.teethCount);
cat c1=new cat();
        System.out.println(c1.name);
        System.out.println(c1.breed);
        System.out.println(c1.color);
        System.out.println(c1.legNo);
        System.out.println(c1.teethCount);    }
}
