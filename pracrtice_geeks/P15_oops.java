package com.pracrtice_geeks;

class base{
    public void print(){
        System.out.println("Base");
    }
}

class Derived extends base{
    public void print(){
        System.out.println("derived");
    }
}

class main{
    public  static  void Doprint(base o){
        o.print();
    }
}
public class P15_oops {
    public static void main(String[] args) {


        base x = new base();
        Derived y = new Derived();
        Derived z = new Derived();
        main.Doprint(y);
    }
}
