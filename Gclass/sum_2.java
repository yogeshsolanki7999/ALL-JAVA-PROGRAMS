package com.Gclass;

public class sum_2 {
    public static void main(String[] args) {
        int [] Sarr={2,5,3,4,1,5};
        boolean ishave=false;
        for (int i=0;i<= Sarr.length-1;i++){
            for (int j=i+1;j<=Sarr.length-1;j++){

                if(Sarr[i]+Sarr[j]==3){

                    ishave=true;
                }

            }
        }
        if (ishave){
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
