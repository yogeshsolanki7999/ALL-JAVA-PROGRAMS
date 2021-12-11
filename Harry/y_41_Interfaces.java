
package com.Harry;

import java.security.PublicKey;

interface Bicycle{
    int a=5;
    void apllyBrake(int decreament);
    void speedUp(int increament);
}
interface hornType{
    void horn1();
    void horn2();
}

class AvonCycle implements Bicycle,hornType{
    void blowHorn(){
        System.out.println("HORN BLOWNN KARDA");
    }
    public void apllyBrake(int dectreament){
        System.out.println("BRAKE IS APPLIED");
    }
    public  void speedUp(int increament){
        System.out.println("SPEEDING UP");
    }
    public void horn1(){
        System.out.println("CHAL CHAIYAA");
    }
    public void horn2(){
        System.out.println("DHOOM MAACHALE DHOOOM");
    }
}

public class y_41_Interfaces {
    public static void main(String[] args) {
     AvonCycle yc=new AvonCycle();
//        yc.apllyBrake(5);
//        System.out.println(yc.a);

        yc.horn1();
        yc.horn2();
        yc.blowHorn();

    }
}
