package com.MySirG;

import java.util.Scanner;

public class m12_multiply_and_Add_two_matrices {
    public static void main(String[] args) {


    int Farr[][]=new int[3][3];
    int Sarr[][]=new int[3][3];
    int emt[][]=new int[3][3];

    Scanner sc=new Scanner(System.in);
        System.out.println("ENTERING THE ELEMENTS IN FIRST ARRAY");

        for (int i=0;i<= Farr.length-1;i++){
            for (int j=0;j<=Farr[i].length-1;j++){
                Farr[i][j]=sc.nextInt();
            }
        }
        System.out.println("ENTERING THE ELEMENTS IN  SECOND ARRAY ");
        for (int i=0;i<= Sarr.length-1;i++){
            for (int j=0;j<=Sarr[i].length-1;j++){
                Sarr[i][j]=sc.nextInt();
            }
        }
        System.out.println("ADDING BOTH ARRAY ");
        for (int i=0;i<= Sarr.length-1;i++){
            for (int j=0;j<=Sarr[i].length-1;j++){
                emt[i][j]= Farr[i][j]+Sarr[i][j];
            }
        }
        System.out.println("FOR PRINTING THE VALUE");
        for (int i=0;i<= emt.length-1;i++){
            for (int j=0;j<=emt[i].length-1;j++){
                System.out.println(emt[i][j]);
            }
        }

}}
