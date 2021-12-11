package com.Gclass;

public class Two_repeating_using_XOR {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,2,1,5,4};
        int ans=0;
        int rbs=0;

        for (int i=0;i<= arr.length-1;i++){
            ans=ans^arr[i];
        }
        rbs=ans&~(ans-1);
        int x=0;
        int y=0;

        for (int i=0;i<= arr.length-1;i++){
            if (((rbs&arr[i])!=0)){
                x=x^arr[i];
            }
            else {
                y=y^arr[i];
            }
        }
        System.out.println(x+" "+y);
    }

}
