package com.pracrtice_geeks;

public class P12_toogle_case {
    public static void main(String[] args) {
        String str="HeLlO";
        for (int i=0;i<=str.length()-1;i++){
            char check=str.charAt(i);
            if (Character.isUpperCase(check)){
                Character.toLowerCase(str.charAt(i));
            }
            else {
                Character.toUpperCase(str.charAt(i));
            }
        }
        System.out.println(str);
    }
}
