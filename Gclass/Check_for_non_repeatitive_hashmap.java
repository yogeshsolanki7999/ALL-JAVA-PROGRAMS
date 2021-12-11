package com.Gclass;

import java.util.HashMap;
import java.util.Scanner;

public class Check_for_non_repeatitive_hashmap {

    public boolean check(String str){
        HashMap<Character,Integer> map=new HashMap<>();
        char ch[]=str.toCharArray();
        //abcdefabcdef
        int counte=0;
        int counti=0;
        for (int i=0;i<=ch.length-1;i++){

            if (map.containsKey(ch[i])){

                Integer val= map.get(ch[i]);
                val++;
                map.put(ch[i],val);
counti++;
            }
            else {
                map.put(ch[i],1);
                counte++;
            }


        }
        if(counte==counti){
            return true;
        }
        return  false;

    }
    public static void main(String[] args) {
        Check_for_non_repeatitive_hashmap m=new Check_for_non_repeatitive_hashmap();
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        if (m.check(str)){
            System.out.println("THERE IS NO NON-REPEATITIVE ELEMENT");
        }
        else {
            System.out.println("THERE IS A NON-REPEATITIVE ELEMENT");

        }
    }
}
