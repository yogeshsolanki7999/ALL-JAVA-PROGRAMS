package com.Gclass;

import java.util.HashMap;
import java.util.Scanner;

public class Check_for_non_repeatitive_hashmap_2nd_way {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i <= str.length() - 1; i++) {
            Character key = str.charAt(i);

            if (map.containsKey(key)) {
                Integer val = map.get(key);
                val = val + 1;
                map.put(key, val);

            } else {
                map.put(key, 1);
            }
        }
        if (map.containsValue(1)){
            System.out.println("THERE IS A REPITIVE ELEMENT AND THA ELEMENT IS ");
            for (Character el:map.keySet()){
                if (map.get(el)==1){
                    System.out.println(el);
                }
            }

        }else {
            System.out.println("THERES NO REPEATITIVE ELEMENT IN STRING");
        }
    }
}