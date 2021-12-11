package com.pracrtice_geeks;

public class P7_reverse_char_array {
    public static void main(String[] args) {

        char [] ar={'H','E','L','L','O',' ','W','O','R','L','D'};

int p=0;
int q= ar.length-1;
char temp=0;

  while (p<q){
      temp=ar[p];
      ar[p]=ar[q];
      ar[q]=  temp;
      p++;
      q--;


  }
        for (char el:ar
             ) {
            System.out.print(el);

        }

    }
}
