package com.practice;

public class MaxArray {
    public static void main(String[] args) {
        int [] a={11,2,3,40,56,65};
        int max=0;
        for (int element:a
        ) {
            if (element>max){
                max=element;
            }

        }
        System.out.println("THE MAXIMUM VALUE OF THE ELEMENT IS="+max);
    }
}
