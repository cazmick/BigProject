package org.example;

import java.util.Arrays;

public class Zeros {

    public static void main(String args[]){

        int[] a ={4,0,0,6,2,0};
        int l=0;
        int r = a.length-1;
        for(int i=0;i<a.length && a[i]!=0;i++){
            a[l]=a[i];

            l++;



        }
        System.out.println(Arrays.toString(a));
    }
}
