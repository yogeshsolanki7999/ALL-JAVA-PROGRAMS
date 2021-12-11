package com.Gclass;

import java.util.HashMap;
import java.util.HashSet;

public class Remove_the_element_from_hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");
        map.put(5,"E");

        for (Integer el:map.keySet()
             ) {
            if (map.get(el).equals("D")){
                map.remove(el);
                break;
            }

        }
        System.out.println(map);
    }
}
