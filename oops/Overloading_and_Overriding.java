package com.oops;
class Bike{
    public void fun(){
        System.out.println("METHOD OF CLASS Bike");

    }
}

class SportBike extends Bike{


    public void fun(int x){
        System.out.println("PARAMETRIZED METHOD OF CLASS SPORTSBike");
    }
    @Override
    public void fun(){
        System.out.println("METHOD OF SPORTS Bike");
    }

}

public class Overloading_and_Overriding {

    public static void main(String[] args) {
        SportBike sp=new SportBike();
        sp.fun(3);
        sp.fun();
    }
}
