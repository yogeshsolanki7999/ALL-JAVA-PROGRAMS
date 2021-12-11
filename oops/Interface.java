package com.oops;

interface parent12{
    int a=6;

    public int sum();
}

class child12 implements parent12,mom{
    int c;
    public int sum(){
        int c=a+2;
        return c;
    }
}
interface mom{
    public int sum();
}

public class Interface {
    public static void main(String[] args) {
        child12 c=new child12();

        System.out.println(c.sum());
    }
}
