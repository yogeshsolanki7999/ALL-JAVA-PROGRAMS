package com.MySirG;

import java.util.Scanner;

public class m6_area_of_circle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        float radius=s.nextFloat();
        float area=3.14f*radius*radius;
        System.out.println(area);
    }
}
