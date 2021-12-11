package com.GAssignments;

import java.util.HashMap;

public class Hashmap_hands_on {
    public static void main(String[] args) {
        String str="aaabbccdddeee";
        HashMap<Character,Integer> map=new HashMap<>();
        int max=0;
        char maxc=0;
        char [] ch=str.toCharArray();
        for (int i=0;i<=ch.length-1;i++){
            if (map.containsKey(ch[i])){
                map.put(ch[i],i);


            }
            else {
                Integer value=map.get(ch[i]);
                value=value+1;
                map.put(ch[i],value);
            }
        }
        for (Character item:map.keySet()
             ) {
            if(max>map.get(item)){
                max=map.get(item);
                maxc=item;
            }
        }
        System.out.println(max+" "+maxc);
    }
}
