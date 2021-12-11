package com.Harry;
class phone{

    public void greeting(){
        System.out.println("HI GOOD MORNING");
    }
    public void on(){
        System.out.println("TURNING ON PHONE");
    }

}
class Smartphone extends phone{
    @Override
    public void on(){
        System.out.println("TURNING ON SMARTPHONE");
    }
    public void Swagat(){
        System.out.println("APKA SWAGAT HE");
    }
}
public class Y39_dynamic_method_dispatch {
    public static void main(String[] args) {
        phone obj=new Smartphone();
        obj.on();//OVERRIDDEN METHOD IS RUN ONLI
        //obj.Swagat();  //NOT ALLLOWED
        obj.greeting();


    }
}
