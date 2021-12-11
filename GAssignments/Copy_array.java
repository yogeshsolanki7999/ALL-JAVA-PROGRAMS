package com.GAssignments;

public class Copy_array {
    public static void main(String[] args) {
        int arr[] = {2, 5, 6, 8, 7, 9};
        int cop[] = {0, 0, 0, 0, 0, 0};
        for (int i = 0; i <= cop.length - 1; i++) {
            cop[i] = arr[i];
        }

        for (int el:cop
             ) {
            System.out.println(el);
        }
    }
}