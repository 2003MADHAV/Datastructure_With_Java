package com.kludsa.b15;
public class MaxSumSubArray {
    public static void main(String[] args) {
        int[] arr = {5,-4,2,6,2};
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int num : arr){
            sum = Math.max(num, sum+num);
            maxSum = Math.max(sum,maxSum);
        }
        System.out.println("MaxSum: "+maxSum);
    }
}