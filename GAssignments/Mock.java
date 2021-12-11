package com.GAssignments;


//Pranshu Jain8:08 PM
//        int a = 4/0
//        nt a[] = new int[4];System.out.println(a[5]);
//        Pranshu Jain8:12 PM
//        There a bank -> sbi -> calculate interest(same)// and print amount (different)
//        Hdfc -> calculate interest(same)// and print amount(different)
//        Write code to implement above(Yes)

class Sbi{
    public static void CalculateIntrest(){
        System.out.println("same");
    }
    public static void printAmount(){
        System.out.println("SBI");
    }

}

class HdFC extends Sbi{
    public static void printAmount(){
        System.out.println("hdfc");
    }

}

public class Mock {
    public static void main(String[] args) {

    }
}
