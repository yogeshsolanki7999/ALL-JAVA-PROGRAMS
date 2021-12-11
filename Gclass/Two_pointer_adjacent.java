package com.Gclass;

public class Two_pointer_adjacent {
    public static void main(String[] args) {
        int[] arr={1,1,2,5,4,7,7,9,9};
        int p1=0;
        int p2=1;

        for (int i=0;i<=arr.length-1;i++){
            if (arr[p1]==arr[p2]){
                p1++;
                p2++;
                continue;
            }else {
                System.out.println(arr[i]);
            }
        }
    }
}
