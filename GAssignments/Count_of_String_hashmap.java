package com.GAssignments;

import java.util.HashMap;

public class Count_of_String_hashmap {
    public static void main(String[] args) {
        String st="tit for tat";
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i=0;i<=st.length()-1;i++){
            if(map.containsKey(i)){
                map.put(st.charAt(i),i);

            }else {
                Integer value=map.get(st.charAt(i));
                value=value+1;
                map.put(st.charAt(i),value);

            }
        }
        Integer max=0;
        Character maxc=0;
        for (Character c: map.keySet()
             ) {
            if (max<map.get(c)){
                max=map.get(c);
                maxc=c;
            }
        }
    }
}
