package com.practice;

import java.nio.channels.FileLock;

public class y12_multidimensional_array {
    public static void main(String[] args) {
        //DECLARATION OF 2D ARRAY
        int[][] flats=new int[2][3];

        //INITIALIZATION THE VALUE USING NAIVE METHOD
        System.out.println("INITIALIZATION THE VALUE USING NAIVE METHOD");
        flats[0][0]=00;
        flats[0][1]=01;
        flats[0][2]=02;
        flats[1][0]=10;
        flats[1][1]=11;
        flats[1][2]=12;
        System.out.println("PRINTING THE VALUE USING NAIVE METHOD");
        //PRINTING THE VALUE USING NAIVE METHOD
        System.out.println( flats[0][0]);
        System.out.println(flats[0][1]);
        System.out.println( flats[0][2]);
        System.out.println( flats[1][0]);
        System.out.println( flats[1][1]);
        System.out.println( flats[1][2]);

        System.out.println("INITIALIZATION THE VALUE USING LOOPS");
        for (int i=0;i<=flats.length-1;i++){
            for (int j=0;j<=flats[i].length-1;j++){
                System.out.println(flats[i][j]);
                System.out.println(" ");
            }
            System.out.println("");

        }


    }

}
