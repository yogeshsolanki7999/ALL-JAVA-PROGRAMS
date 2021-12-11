package com.Harry;

import java.util.Scanner;

public class y20_inhanced_switch_case {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();

        switch (age) {
            case 25 -> System.out.println("YOU ARE AN ADULT");
            case 45 -> System.out.println("YOU ARE A  MAN");

            case 55 -> System.out.println("YOU ARE A OLD MAN");

            default -> System.out.println("YOU ARE AN ANIMAL");
        }
    }

}