package com.practice;

class  pass{
    String password;
    public void check(String ps){
        if(ps.equals("7999894152@yY")){
            System.out.println("welcome in our app");
        }
        else {
            System.out.println("INVALID PASSWORD");
        }
    }
}
public class password_Validation {
    public static void main(String[] args) {
        pass p=new pass();
        p.check("799989152@yY");
    }
}
