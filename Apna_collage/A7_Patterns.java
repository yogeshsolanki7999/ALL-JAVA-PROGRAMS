package com.Apna_collage;

class Pattern{
    public  void solidRectangle(){
        for (int i=0;i<4;i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public void hollowRectangle(){
        int n=4;
        int m=5;
        for (int  i=1;i<=n;i++){
            for ( int j=1;j<=m;j++){
                if (i==1 || j==1 || i==n || j==m){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void halfPyramid(){
        int r=5;
        int c=5;
        for (int i=1;i<=r;i++){

            for (int j=1 ;j<=c;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }


}

public class A7_Patterns {
    public static void main(String[] args) {
        Pattern p=new Pattern();
        //p.solidRectangle();
        //p.hollowRectangle();
        p.halfPyramid();
    }
}
