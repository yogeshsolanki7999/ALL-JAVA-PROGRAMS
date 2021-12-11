package com.ReProgrammed;
interface cycle{
     public void brake(int dec);
   public void speedUP(int inc);
   public static void  su(){
       System.out.println("i am su of interface");
   }
}

class Avon implements cycle{
    int speed=10;
    public void brake(int dec){
        speed=speed-dec;
    }
    public void speedUP(int inc){
        speed=speed+inc;
    }

    public int getspeed(){
        return speed;
    }

}

public class Interface2 {
    public static void main(String[] args) {
        Avon av=new Avon();
       av.speedUP(65);
        av.brake(40);
        System.out.println(av.getspeed());
         cycle.su();
    }
}
