package com.pracrtice_geeks;

public class P11_pallindrome_substrings {
    public static boolean ispallindrome(String str){

        int p1=0;
        int p2=str.length()-1;
        while (p1<p2){
            if (str.charAt(p1)==str.charAt(p2)){
                p1++;
                p2--;
            }
            else {
                return false;

            }



            }

return true;
        }


    public static void main(String[] args) {
        String str="abcbcac";
        for (int i=0;i<=str.length()-1;i++){
            System.out.println("String of "+str.charAt(i)+" is -:");
            for (int j=i+1;j<=str.length();j++){

                if (ispallindrome(str.substring(i,j))){
                    System.out.println(str.substring(i,j));
                }
            }
    }

}
}
