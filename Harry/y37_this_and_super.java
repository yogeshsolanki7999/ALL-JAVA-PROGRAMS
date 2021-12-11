package com.Harry;
class ekclass{
    int a;
    ekclass(int a){
       this. a=a;
    }
    ekclass(){
        System.out.println("i am a default constructor");
    }

    public int getA() {
        return a;
    }

    public int returnone(){
        return 1;
    }

}
class doclass extends ekclass{
    doclass(int b){
        super(b);
        System.out.println("i am aconstructor");
    }

}

public class y37_this_and_super {
    public static void main(String[] args) {


    //ekclass e=new ekclass(5);
     //   System.out.println(e.getA());
        doclass d=new doclass(5);


}}
