package com.Harry;

class base{
     public int x;
     base(){
         System.out.println("CONSTRUCTOR OF BASE CLASS");
     }
     base(int x){
         System.out.println(" PARAMETRIXED CONSTRUCTOR OF BASE CLASS WITH VALUE"+x);


     }
 }
 class derived extends base{
     public int y;
     derived(){
         System.out.println("CONSTRUCTOR OF DERIVED CLASS");
     }
     derived(int x,int y){
         super(5);
         System.out.println(" PARAMETRIXED CONSTRUCTOR OF BASE CLASS WITH VALUE"+y);


     }

 }
 class cderived extends derived{
     public int z;
     cderived(){
         System.out.println("CONSTRUCTOR OF CDERIVED CLASS");
     }
     cderived(int x,int y,int z){
         super(x,y);
         System.out.println(" PARAMETRIXED CONSTRUCTOR OF BASE CLASS WITH VALUE"+z);


     }

 }
public class y36_constructors_in_inheritance {
    public static void main(String[] args) {
      cderived obj=new cderived(4,6,7);

}}
