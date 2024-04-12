package org.example;

import org.testng.annotations.Test;

public class StocksBS {

    @Test
    public void BSMethod2(){
        int[] stockPrice={10,3,32,322,12,6,11};
        int buyPrice =stockPrice[0];
        int maxProfit =0;
        for(int i=0;i< stockPrice.length;i++){
            buyPrice = Math.min(buyPrice,stockPrice[i]);
            int profit =stockPrice[i]-buyPrice;
            maxProfit = Math.max(profit,maxProfit);

        }
        System.out.println(maxProfit);
    }

    public void MultipleBuySell(int[] stockPrice){
        int netProfit=0;
        for(int i=0;i<stockPrice.length;i++){
            if(stockPrice[i+1]>stockPrice[i]){
                netProfit+=stockPrice[i+1]-stockPrice[i];
            }
        }
        System.out.println(netProfit);
    }

    public static void main(String[] args){
        int[] stock_price={10,3,32,322,12,6,11};
        int[] aux = new int[stock_price.length];
        int[] profits = new int[stock_price.length];
        int max=-1;
        int max_ind=-1;


        for(int i = stock_price.length-1; i>-1;i--){


            if(i== stock_price.length-1){
                aux[stock_price.length-1]= stock_price[stock_price.length-1];
            }else {
                if(stock_price[i+1]>stock_price[i]){
                    aux[i]=stock_price[i+1];
                }else {
                    aux[i]=stock_price[i];
                }
            }
            profits[i]= aux[i]-stock_price[i];

            if(profits[i]>max){
                max=profits[i];
                max_ind=i;
            }

        }
        System.out.println("Max Profit "+max);
        System.out.println("Buy : "+ stock_price[max_ind]);
        System.out.println("Sell : "+ aux[max_ind]);
    }
}
