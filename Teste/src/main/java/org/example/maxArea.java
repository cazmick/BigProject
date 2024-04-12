package org.example;

import org.testng.annotations.Test;

public class maxArea {

    @Test
    public void maxWater(){
        int b[] = {3, 1, 2, 4, 5};
        int l=0,r=b.length-1;
        int area =0;
        while(l<r){

            area=Math.max(area,Math.min(b[l] ,b[r])*(r-l));
            if(b[l] < b[r]){
                l+=1;
            }else {
                r-=1;
            }


        }

        System.out.println(area);


    }
}
