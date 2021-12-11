package com.Apna_collage;
class Student3{
    String name;
    int age;
    String phoneNo;
    String rollNo;
    int classNo;
    String group;
}
class PersonalInfo extends Student3{

    public void printInfo(String name ,int age ,String phoneeNO){
        System.out.println(name);
        System.out.println(age);
        System.out.println(phoneeNO);
    }

}
class ClassInfo extends Student3{

    public void printInfo(String rollNo ,int classNo ,String group){
        System.out.println(rollNo);
        System.out.println(classNo);
        System.out.println(group);
    }

}


public class A5_InheritanceHierarical {


}
