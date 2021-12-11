package com.Harry;

class student{
     private int id;
    private String name;
    private int className;


    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setClassName(int className){
        this.className=className;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getClassName()
    {
        return className;
    }
}

public class y33_Access_modifiers_and_setter_getter {
    public static void main(String[] args) {

        student stu=new student();

        stu.setName("YOGESH");
        stu.setId(101);
        stu.setClassName(12);
        System.out.println(stu.getName());
        System.out.println(stu.getId());
        System.out.println(stu.getClassName());
    }

}
