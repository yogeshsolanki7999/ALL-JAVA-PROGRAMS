package com.oops;
class  parent{
    public parent(){
        System.out.println("CONSTRUCTOR OF PARENT CLASS");
    }
    public parent(int y){
        System.out.println("PARAMETRIZED CONSTRUCTOR OF PARENT ");
    }
}

class child extends parent{
    public child(){
        super();//
        // NAHI BHI LAGAYENGE TO COMPILER BY DEFAULT LAGA DETA HE
        System.out.println("CONSTRUCTOR OF CHILD CLASS");
    }
    public child(int x){
        super(5);
        System.out.println("CONSTRUCTOR OF PARAMETER");
    }
}
public class Constructors_in_iheritance {
    public static void main(String[] args) {
        child c=new child(2);


    }
}
