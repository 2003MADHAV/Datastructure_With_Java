package com.kludsa.b15;
public class StroboGrammaticNumber{
    public static void main(String[] args) {
        String num = "9910011100166"; //"8196699618";
        int[] rotated={'0','1','#','#','#','#','9','#','8','6'};
        int left = 0,right = num.length()-1;
        boolean flag = true;
        while(left<=right){
            if(num.charAt(left++)!=rotated[num.charAt(right--)-'0']){
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println("Strobogrammatic Number");
        else
            System.out.println("Not Strobogrammatic Number");
    }
}