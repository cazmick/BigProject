package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        String s ="abciiidef";
        int k=3;
        System.out.println(maxVowels(s,k));
    }

    public static int maxVowels(String apha, int k){
        char [] vow = {'a', 'e', 'i', 'o', 'u'};
//            Set<Character> vowels = new HashSet<Character>();
//            vowels.add('a');
//            vowels.add('e');
//            vowels.add('i');
//            vowels.add('o');
//            vowels.add('u');


        int maxVowelsSofar = 0;



        for(int i =0;i<apha.length()-k;i++){
            String subsString = apha.subSequence(i,i+k).toString();
            int count = 0;
            Set<Character> newVal = new HashSet<Character>();
            List<Character > sets = new ArrayList<Character>();

            if(subsString.contains("a") || subsString.contains("e")|| subsString.contains("i")||subsString.contains("o"),subsString.contains("u")){
                count++;
            }

//            newVal.addAll(new ArrayList<Character>().addAll(subsString.toCharArray());

//            for(char a : subsString.toCharArray()){
//
//                if(vowels.contains(a)){
//                    count++;
//
//                }
//            }
            maxVowelsSofar = Math.max(maxVowelsSofar,count);



        }

        return maxVowelsSofar;
    }
}
