package com.Gclass;

public class Stocks_leetcode {

        public int maxProfit(int[] prices) {
            int min=prices[0];
            int max=0;
            int day=0;
            for (int i=0;i<= prices.length-1;i++){

                if (prices[i]<min){
                    min=prices[i];
                    break;
                }
            }
            for (int j=0;j<=prices.length-1;j++){
                if (prices[j]==min){
                    break;
                }
                day++;
            }
            for (int i=day;i< prices.length;i++){
                if (prices[i]>max){
                    max=prices[i];
                }

            }

            int profit=max-min;
            if (profit!=0){
                return profit;
            }

            return 0;
        }

        public static void main(String args[]){

            int a[]={2,4,1};
            Stocks_leetcode m=new Stocks_leetcode();
            int result=m.maxProfit(a);
            System.out.println(result);
        }
    }

