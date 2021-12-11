package com.Harry;

public class y29_method_overloading {
    static void foo(){
        System.out.println("GOOD MORNING BRO");
    }
    static  void foo(int a){
        System.out.println("GOOD MORNING "+a+"  BRO");
    }
    static void foo(int b, int c){//INT C IS AN PARAMETERS
        System.out.println("GOOD NIGHT BRO ");
    }

    static void change2(int arr[]){
        arr[0]=45;
    }

    static  void change(int x){
        x=98;
    }
    static void joke(){
        System.out.println("abe chutiye joke sunega");
    }

    public static void main(String[] args) {
        //joke();
        //int x=45;
        //change(x);
        //System.out.println(x);

        //int [] a={55,66,54,55};
        //change2(a);
        //System.out.println("ARRAY AFTER CHANGE  "+a[0]);


        //METHOD OVERLOADING

        foo();
        foo(544);
        foo(6,5);//5 IS ARGUMENT

    }

}
