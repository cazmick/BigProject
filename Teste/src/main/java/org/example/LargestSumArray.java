package org.example;

import org.testng.annotations.Test;

public class LargestSumArray {
    int[] ray = {4,5,-10,15,6,8};

    @Test
    public void contiguousSumArray(){
        int maxSum=0;
        int sum=0;
        String Definer ="";
        int[] maxSumArray;
        for (int i=0;i< ray.length-1;i++){

            sum=ray[i];
            for(int j =i;j< ray.length;j++){
                if(i!=j && sum<sum+ray[j]){
                    sum = sum+ray[j];
                    maxSum=Math.max(maxSum,sum);


                }else if (sum >sum+ray[j] && i!=j && sum>=maxSum){
                    Definer = Definer + sum+"_"+i+"_"+j;
                    Definer = Definer + " ,";
                    break;


                }else{
                    break;
                }

            }

        }
        Definer=Definer.substring(0,Definer.length()-1);
        System.out.println(Definer);

        System.out.println(maxSum);
    }

    @Test
    public void Approch2(){
        int maxSum =0;
        int sum =0;
        for(int i=0;i< ray.length-1;i++){
            if(ray[i]>-1 && ray[i+1]>-1){
                if(sum==0){
                    sum= ray[i]+ray[i+1]+sum;
                }else {
                    sum=sum+ray[i+1];
                }
                maxSum =Math.max(sum,maxSum);
            }else {
                maxSum =Math.max(sum,maxSum);
                sum=0;
            }

        }
        System.out.println(maxSum ) ;
    }


    @Test
    public void maxProduct(){
        int[] ray = {4,5,-10,15,6,8};
        int maxproduct =0;
        int product =1;
        for(int i =0; i<ray.length-1;i++){
            if(product==1){
                product = ray[i]*ray[i+1] *product;
            }else {
                product =product*ray[i+1];
            }
            maxproduct = Math.max(product,maxproduct);
            if(product<maxproduct){
                product=1;
            }else {
                product=maxproduct;
            }

        }
        System.out.println(maxproduct);



    }


    @Test
    public void maxProduct2(){
        int[] ray = {4,5,-10,15,6,8};
        int maxproduct =0;
        int product =1;
        for(int i =0; i<ray.length-1;i++){
            product = ray[i] *product;
            maxproduct = Math.max(product,maxproduct);
            if(product<maxproduct){
                product=1;
            }else {
                product=maxproduct;
            }

        }
        System.out.println(maxproduct);



    }


}
