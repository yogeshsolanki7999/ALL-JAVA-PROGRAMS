package com.oops;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

class overload{
    public void passCheck(String pas){
        if (pas.equals("yash29gaming")){
            System.out.println("HAPPY BIRTHDAY YASH  WISH YOU A VERY HAPPY DAY");
        }
        else {
            System.out.println("INVALID PASSWORD");
        }



    }
    public void passCheck(String pas,String name){
        if (pas.equals("yash29gaming") && name.equalsIgnoreCase("randa")){
            System.out.println("HAPPY BIRTHDAY RANDA  WISH YOU A VERY HAPPY DAY");
        }
        else {
            System.out.println("INVALID PASSWORD");
        }



    }


}
class Inoverload extends overload{
    public void passCheck(){
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER YOU ID");
        int id= scan.nextInt();
        scan.nextLine();
        if (id==738964){
            overload over=new overload();
            System.out.println("ENTER YOUR PASSWORD AND NAME");
            over.passCheck(scan.nextLine(),scan.nextLine());
        }
        else {
            System.out.println("INVALID ID");
        }

    }
}
public class method_overloading {
    public static void main(String[] args) {
        Inoverload in=new Inoverload();
        in.passCheck();
    }
}
