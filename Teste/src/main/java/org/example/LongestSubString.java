package org.example;

import org.testng.annotations.Test;

import java.util.*;

public class LongestSubString {

    public String longerString (String a, String b){
        if(a.length()>b.length()){
            return a;
        }else {
            return b;
        }
    }

    @Test
    public void tryer(){
        String a ="helloBruno";
        String[] b = a.split("");
        Map<String,Integer> hsad = new LinkedHashMap<String, Integer>();
        for(int i=0;i<b.length-1;i++){
            int j=i+1;
            while (j>0){
                if(hsad.containsKey(b[j])){
                    int val = hsad.get(b[j]);

                    j=-1;

                }else {
                    hsad.put(a.substring(i,j),a.substring(i,j).length());
                    j++;
                }


            }


        }
    }



    @Test
    public void nonRecurring(){
//        Map<String,Integer> datas = new HashMap<>();
        String a= "helloBruno";

//        char[] charays = a.toCharArray();
        String newString=a.substring(0,1);
        for(int i=0;i<a.length()-1;i++){
            if(!newString.contains(a.substring(i,i+1))){
                newString=a.substring(i,i+1);
            }
            int j=i+1;
            while(j>0){

                    String temp = a.substring(i,j);
                    if(!temp.contains(newString)){
                        newString = longerString(newString,temp);

                    }
                j++;


            }

        }

        System.out.println(newString);

    }




    @Test
    public void newLogic(){
        String current = "hellobrehpaelcnkcncnascnaskncnacncuw ,mxwevmddhvedjhwye asxmbvn e";
        String ne ="";
//        SortedMap<String,Integer> hashMap= new TreeMap<>();
        int max=0;
        String lpngestTillNow ="";
       for(int i=0;i<current.length();i++){
           if(!ne.contains("" + current.charAt(i))){
               ne = ne + current.charAt(i);
           }else {
//               hashMap.put(ne,ne.length());
               max=Math.max(max,ne.length());
               if(ne.length()==max){
                   lpngestTillNow = ne;
               }
               if(!(current.length() - ne.length()<ne.length())){
                   ne ="";
                   i--;
               }

           }


       }
       System.out.println(lpngestTillNow);

    }
}
