package com.Harry;

class employee{
    int id;
    String name;
    int salary;

    public void printingAttributes(){
        System.out.println("MY    ID    IS   ="+id);
        System.out.println("AND MY NAME IS  ="+name);
    }
    public int getSalary(){
        return salary;
    }
}

public class y32_custom_class {
    public static void main(String[] args) {
        System.out.println("THIS IS OUR CUSTOM CLASS");

        employee obj1=new employee(); //INSTANTIATING A NEW OBJECT
        employee obj2=new employee(); //INSTANTIATING 2ND NEW OBJECT

        //SETTING ATTRIBUTES FOR 1ST EMPLOYEE
        obj1.id=101;
        obj1.name="YOGESH";
        obj1.salary=60000;

        //SETTING ATTRIBUTES FOR 2ND EMPLOYEE
        obj2.id=102;
        obj2.name="SHIKHA";
        obj2.salary=5000;

        //PRINTING THE ATTRIBUTES
       // System.out.println(obj1.id);
       // System.out.println(obj1.name);


        //PRINTING ATTRIBUTES BY METHOD
        int salary= obj1.getSalary();
        obj1.printingAttributes();
        System.out.println("slary= "+salary);
        System.out.println();
        int salary2= obj2.getSalary();
        obj2.printingAttributes();
        System.out.println("slary= "+salary2);

    }

}
