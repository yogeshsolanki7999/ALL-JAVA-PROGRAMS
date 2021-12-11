package com.Harry;
 abstract class parent1{

    parent1(){
        System.out.println("I AM THE CONSTRUCTOR OF PARENT CLASS");
    }
    public void Sayhello(){
        System.out.println("HELLO");
    }
     abstract public  void greet(String str);
}
class child1 extends parent1{
     public void greet(String str){
         System.out.println("GOOD MORNING");
     }
}
  abstract class child2 extends parent1{
     public void th(){
         System.out.println( "I AM GOOD");
     }

}
public class y40_Abstract {
    public static void main(String[] args) {
        child1 ch1=new child1();
        ch1.greet("y");

    }
}
