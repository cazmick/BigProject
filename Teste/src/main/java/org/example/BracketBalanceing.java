package org.example;

import java.util.Stack;

public class BracketBalanceing {

    public static void main(String[] args){
        BracketBalanceing balanceing = new BracketBalanceing();
        String s = "{(()[])}";
        System.out.println(balanceing.isBalances(s));
    }

    public boolean isMatching(char a, char b){
        return (a=='(' && b==')')
                || (a=='{' && b=='}')
                || (a=='[' && b==']') ;
    }

    public boolean isBalances(String s){
        Stack<Character> brack = new Stack<Character>();

        for(int i =0;i<s.length();i++){
            if((s.charAt(i)=='(')||(s.charAt(i) == '{')||(s.charAt(i) == '[')){
                brack.push(s.charAt(i));
            }else {
                if(brack.empty()){
                    return false;
                } else if (!isMatching(brack.peek(),s.charAt(i))) {
                    return false;
                    
                }else {
                    brack.pop();
                }
            }






        }


        return brack.empty();
    };

}
