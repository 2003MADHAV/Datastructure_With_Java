package com.kludsa.b12;
public class StroboGrammaticNumber {
    public static void main(String[] args) {
        String num = "180669081";
        char[] flipped = {'0','1','#','#','#','#','9','#','8','6'};
        int start=0,end=num.length()-1;
        boolean flag = true;
        while(start<=end){
            if(num.charAt(start++)!=flipped[num.charAt(end--)-'0']){
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println("StroboGrammatic Number");
        else
            System.out.println("Not StroboGrammatic Number");        
    }
}