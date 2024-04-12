package org.example;

public class Temp {
    public static void main(String args[]){
        String a ="qwerty";
        int oridgnalStringLength = a.length();
        String b ="qwerty";
        a=a+a;
        if(a.contains(b) && b.length()<=oridgnalStringLength){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }
}
