package com.GAssignments;

public class resverseTheStringByWords {
    public static void main(String[] args) {



    String str="this is geeksters";
    char  []ch =  str.toCharArray();
    int l=ch.length;
    int mid=Math.floorDiv(l,2);
    int temp=0;
    for (int i=0;i<=ch.length-1;i++){
        //SWAP CH[I] WITH CH[L-I-1]
        temp=ch[i];
        ch[i]=ch[l-i-1];
        ch[l-i-1]= (char) temp;
    }
}}
