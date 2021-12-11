package com.Harry;

public class y27_multidimensional_array {
    public static void main(String[] args) {


    int[][] flats=new int[2][3];
    flats[0][0]=26;
    flats[0][1]=27;
    flats[0][2]=28;
    flats[1][0]=29;
    flats[1][1]=30;
    flats[1][2]=31;
        System.out.println(flats.length);
    //DISPLAYING THIS ELEMTS USING FOR LOOP
        for (int i=0;i<flats.length;i++){
          for(int j=0;j<flats[i].length;j++){
              System.out.println(flats[i][j]);
              System.out.println(" ");
          }
            System.out.println("");
        }
}}
