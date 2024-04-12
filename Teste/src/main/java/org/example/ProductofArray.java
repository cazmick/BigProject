package org.example;

import org.testng.annotations.Test;

public class ProductofArray {

    @Test
    public void poa(){
        int n=5;
        int total=1;

        int[] araay = {1,5,3,7,8};

        for ( int i=0;i< araay.length;i++
             ) {
            if(araay[i]==n){
                araay[i]=1;
            }
            total=araay[i]*total;


        }
        System.out.println(total);


    }
}
