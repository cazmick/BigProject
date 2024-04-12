package org.example;

import org.testng.annotations.Test;

import java.util.Arrays;

public class Sequence {




    public static int[] addOne(int [] number){

        int carry = 1;
        int index = number.length-1;

        while(index>=0){
            int x = number[index]+carry;
            if(x>=10){
                x = x-10;
                carry = 1;
            } else{
                carry = 0;
            }

            number[index] = x;
            index--;
        }
        //check if new array is needed
        if(carry>0){
            int [] newNumber = new int[number.length+1];
            newNumber[0]=1;
            for (int i = 0; i < number.length ; i++) {
                newNumber[i+1] = number[i];
            }
            return newNumber;
        }
        return number;
    }



    @Test
    public void caller(){
        System.out.println(Arrays.toString(addOne(new int[]{9,9,9})));
    }
}


