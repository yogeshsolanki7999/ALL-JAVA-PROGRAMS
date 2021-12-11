package com.Harry;

public class y26_for_each_and_arrays {
    public static void main(String[] args) {
       /* float[] marks={ 65.5f,65.5f,55.8f,45.45f};
        String[] students={"SHUBHAM","YOGESH","SHIKHA","PARI"};
        System.out.println("ARRAY LENGTH OF MARK IS"+marks.length);
        System.out.println("THE NAME OF THE STUDENT IN INDEX 2 IS ==  "+students[2]);
       */

        int [] marks={54,65,47,85,21};
        //DISPLAYING THE ARRAY(NAIVE WAY)
        System.out.println("PRINTING THE ARRAY(NAIVE WAY");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        //DISPLAYING THE ARRAY USING LOOPS
        System.out.println("PRINTING THE ARRAY USING LOOPS");
        for (int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

        //DISPLAYING THE ARRAY USING FOR-EACH LOOP
        System.out.println("PRINTING THE ARRAY USING FOR-EACH LOOP");
        for (int elements:marks){
            System.out.println(elements);
        }
    }
}
