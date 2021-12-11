package com.oops;
 abstract class library{
    String name,gender,who;
    int age,id;

    public void issue(){
        System.out.println("YOU ISSUED A BOOK");
    }
    public void submit(){
        System.out.println("YOU SUBMIT THE BOOK SUCCESSFULLY");
    }
     abstract public void period(int p);
}
class student extends library{
     @Override
     public void period(int p){
         if(p<30){
             System.out.println("YOU HAVE NO PENALTIES");
         }
         else {
             System.out.println("YOU HAVE TO SUBMIT PENALTY");
         }
     }
}
class Faculty extends library{
     @Override
    public void period(int p){
        if(p<15){
            System.out.println("YOU HAVE NO PENALTIES");
        }
        else {
            System.out.println("YOU HAVE TO SUBMIT PENALTY");
        }
    }

}
   class sober extends library{
      public void period(int p){

     }
}
public class Abstract_keyword {

}
