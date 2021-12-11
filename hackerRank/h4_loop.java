package com.hackerRank;
import java.util.Scanner;

public class h4_loop {

    public static void main() {

        Scanner in = new Scanner(System.in);
        System.out.println("entyer a value");
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for (int j = 0; j < n; j++) {
                a = a + (int) Math.pow(2, j) * b;
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }}






