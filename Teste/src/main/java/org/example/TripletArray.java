package org.example;

import org.testng.annotations.Test;

import java.util.HashSet;

public class TripletArray {

    @Test
    public void TripletArray(){
        int[] araay  ={1,2,3,4,5};
        HashSet<Integer> setter = new HashSet<>();
        for(int i=1;i<araay.length-1;i++){
            for(int j=i+1;j<araay.length;j++){
                if(setter.contains(-(araay[i]+araay[j]))){
                    System.out.println("("+araay[i]+" "+araay[j]+" "+-(araay[i]+araay[j])+")");
                }else {
                    setter.add(araay[j]);
                }
            }
        }
    }
}
