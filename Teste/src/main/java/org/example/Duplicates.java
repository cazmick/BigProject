package org.example;

import org.testng.annotations.Test;

import java.util.*;

public class Duplicates {
    @Test
    public void duplicate(){
        int[] a = {6,1,2,3,4,5,6,6,7,8,1};

        SortedMap<Integer,Boolean> isDuplicate= new TreeMap<Integer,Boolean>();
        for (int i:a
             ) {
            if(isDuplicate.containsKey(i)){
                isDuplicate.put(i,true);
                System.out.println(true);
                break;
            }else {
                isDuplicate.put(i,false);
            }
        }
    }




}
