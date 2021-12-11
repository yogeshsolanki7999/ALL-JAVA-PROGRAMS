package com.Apna_collage;
class  Student2{
    String name;
    int age ;
    public void print(){
        System.out.println(name);
        System.out.println(age);
    }
    public void print(String name){
        System.out.println(name);
    }
    public void print (int age){
        System.out.println(age);
    }

}
public class A3_CompileTime_polymorrphism {
    public static void main(String[] args) {
        Student2 s=new Student2();
        s.age=23;
        s.name="yogerh";
        s.print();
        s.print(52);
        s.print("yi");
    }

}
