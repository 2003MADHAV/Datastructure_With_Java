package com.kludsa.b15;
public class MaxSumSubArraySizeK {
    public static void main(String[] args) {
        //int[] arr = {2,3,1,4,6,4,5,9};
        int[] arr = {1,10,23,3,10,4,2,0,20};
        int k = 4,i=0,j=0;
        int windowSum = 0,maxSum = Integer.MIN_VALUE;
        int start=0,end=0;
        while(end<k)
            windowSum+=arr[end++];
        maxSum = windowSum;
        while(end<arr.length){
            windowSum+=arr[end++]-arr[start++];
            if(windowSum>maxSum){
                maxSum = windowSum;
                i=start;j=end-1;
            }
        }
        System.out.println("MaxSum: "+maxSum);
        System.out.println("["+i+","+j+"]");
        for (int l=i;l<j+1;l++){
            System.out.print(arr[l]+" ");
        }
        System.out.println();
    }
}