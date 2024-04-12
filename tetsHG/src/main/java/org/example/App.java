package org.example;

import java.util.Arrays;

/**
 * Adding one to number represented as array of digits (without using ArrayList, Map, List)
 *
 * Input 1: [1, 2, 4] -> int []input1 = {1,2,4};
 * Output 1: [1, 2, 5]
 *
 * Input 2: [0,0,2] -> int []input2 = {0, 0, 2};
 * Output 2: [0,0,3]
 *
 * Input 3: [9,9] -> int []input3 = {9, 9};
 * Output 3: [1,0,0]
 *
 * Explanation:
 * Input 1 - [1,2,4] -> 124 -> (124 + 1) -> 125 -> [1,2,5]
 *
 * Input 2 - [0,0,2] -> 002 -> (002 + 1) -> 003 -> [0,0,3]
 *
 * Input 3 - [9,9] -> 99 -> (99 + 1) -> 100 -> [1,0,0]
 *
 */
public class App 
{




    public static void main( String[] args )
    {
        int[] a = {9};
        int carry =5;
        //99


        for(int i =a.length-1;i>=0;i--){
            a[i]=a[i]+carry;
            if(a[i]>9){
                a[i] = a[i]-10;
                carry=1;
            }else {
                carry=0;
            }
        }
        int[] neArr=new int[a.length+1];
        if(carry>0){
            neArr[0]=carry;
            for(int i=1;i<neArr.length;i++){
                neArr[i] =a[i-1];
            }
            System.out.println(Arrays.toString(neArr));
//            Assert.assertEqiual();
        }else {
            System.out.println(Arrays.toString(a));
        }



    }
}
