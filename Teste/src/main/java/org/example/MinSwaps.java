package org.example;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;

public class MinSwaps {

    @Test
    public void minSwaps(){

        int[] input = new int[]{1, 3, 7, 6, 4,5,2};
        int len = input.length;
        boolean[] visited = new boolean[len];
        Arrays.fill(visited, false);
        HashMap<Integer,Integer> mapper = new HashMap<>();
        for(int i=0;i<len;i++){
            if(!mapper.containsKey(input[i])){
                mapper.put(input[i],i);
            }else {
                visited[i]=true;
            }

        }
        Arrays.sort(input);


        int ans = 0;
        for (int i=0;i<len;i++){
            if (visited[i] || mapper.get(input[i]) == i){
                continue;
            }


            int j=i;
            int cycle_size=0;
            while (!visited[j]){
                visited[j] =true;
                j=mapper.get(input[j]);
                cycle_size++;
            }
            if (cycle_size > 0) {
                ans += (cycle_size - 1);
            }
        }
         System.out.println(ans);






    }

//
//
//    @Test
//    public void findMissingNumnber(){
//
//        int[] a = {0,1,2,3};
//
////
////        for(int  i=0;i<a.length-1;i++){
////            if (a[0]>0){
////                System.out.println(0);
////                break;
////            }else {
////                if(a[a[i]-1==a.length-1){
////                    System.out.println((a[i]) +1);
////                }
////                if(a[i+1] -a[i]>1){
////                    System.out.println((a[i]) +1);
////                }
//            }
//        }
//
}
