package com.oops;
class custom{
    int id;
    String name;//DATA MEMBERS

    public void print(){
        System.out.println(id);
        System.out.println(name);
    }

}

public class O1_Custom_class {
    public static void main(String[] args) {

        //INSTANTIATING OBJECTS
        custom c=new custom();

        //SETTING VALUES OF DATA MEMBERS
        c.id=101;
        c.name="YOGESH";

        //PRINTING THE VALUES OF DATA MEMBERS
        System.out.println(c.id);
        System.out.println(c.name);

        //PRINTING THE VALUES OF DATA MEMBERS USING METHODS
        c.print();


    }
}
