package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeftRotation {
    static ArrayList<Integer> integers = new ArrayList<Integer>();
    public static void main(String[] args){
        int[] dabba = {1, 76, 9, 4, 74, 33, 54};
        int n=1;
        System.out.println(nRotated2(dabba,1));
    }

    public static  ArrayList<Integer> nRotated(int[] array, int n){
        int excl = n%array.length;
        for(int i =excl;i<array.length;i++)
        {
            integers.add(array[i]);
        }
        for(int i =0;i<excl;i++){
            integers.add(array[i]);
        }

        return integers;
    }

    public static  char[] nRotated2(int[] array, int n){
        List<Character> lister = new ArrayList<>();
        int excl = n%array.length;
        char[] newArray = new char[array.length];
        String tem = Arrays.toString(array);
        tem = tem.substring(array.length-excl , array.length) + tem.substring(0,excl-1);
        newArray = tem.toCharArray();
//        newArray = array[array.length -excl,array.length] + array[0,excl-1];
        return newArray;
    }




}
