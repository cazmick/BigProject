package org.example;

/**
 * Hello world!
 *
 * STring a ="heeloworld";
 * a= "jdbfjb";
 * String b= "heeloworld";
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String a = "Heloworls";
        System.out.println(recursiveString(a, a.length()));


    }
    public static String recursiveString(String a,int counter){
        if(counter >1){

            a= a.charAt(a.length()-1)+ a.substring(0,a.length()-1);
            counter=counter-1;
            return recursiveString(a,counter);
        }else {
            return a;

        }


    }


}
