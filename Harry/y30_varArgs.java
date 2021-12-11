package com.Harry;

public class y30_varArgs {
  static int sum(int ...ar){
     int add=0;
      for (int element:ar
           ) {
        add=add+element;
      }

      return add;
    }
    public static void main(String[] args) {
        System.out.println("WELCOME TO VARARGS TUTORIAL");
        System.out.println("THE SUM OF 4 AND 5 IS "+sum(4,5));
        System.out.println("THE SUM OF 4 AND 5  AND 6 IS "+sum(4,5,6));
        System.out.println("SUM OG ALL THIS NUMBERS ARE = "+sum(5,5,54,8,5,5));
        System.out.println("SUM OF NOTHING = "+sum());
    }
}

