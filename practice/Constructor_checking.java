package com.practice;
class par{
    int wealth;
}
class chil extends  par{
    chil(int x){
        this.wealth=x;
    }
    chil(){
        System.out.println("child empty value");
    }
}

public class Constructor_checking {
    public static void main(String[] args) {
        chil ch=new chil();
        chil ch1=new chil(450000);
        System.out.println(ch1.wealth);
    }
}
