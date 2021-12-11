package com.Harry;
class students{
    private int id;
    private String name;
    private int className;


public students() {
    
    id=101;
    name="yogesh solanki";
}
    public students(String name) {
        id=101;
        this.name=name;
    }
    public students(String name,int id) {
        this.id=id;
        this.name=name;
    }public students(String name,int id,int className) {
        this.id=id;
        this.name=name;
        this.className=className;
    }



    public int getId(){
        return id;
    } public String getName(){
        return name;
    } public int getClassName(){
        return className;
    }
}

public class y34_constructors {
    public static void main(String[] args) {
//        students stu=new students("pari",5000,12);
//        System.out.println(stu.getName());
//        System.out.println(stu.getId());
//        System.out.println(stu.getClassName());

//        students stu2=new students();
//        System.out.println(stu2.getId());
//        System.out.println(stu2.getClassName());
//        System.out.println(stu2.getName());
//        System.out.println(stu2.getClass());


        }}

