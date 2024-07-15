package com.kludsa.b12;
public class MaxSumSubArraySizeK {
    public static void main(String[] args) {
        int[] arr = {2,3,1,4,6,7,4,5,9};
        int k = 4,i;
        int windowSum = 0;
        for(i=0;i<k;i++)
            windowSum += arr[i];
        int maxSum = windowSum;
        i=1;
        int start=0,end=0;
        while(i<=(arr.length-k)){
            windowSum += arr[i+k-1]-arr[i-1];
            if(windowSum>maxSum){
                maxSum = windowSum;
                start = i;end=i+k-1;
            }
            i++;
        }
        System.out.println(maxSum+" is available at ["+start+","+end+"]");
        for (int j = start; j < end+1; j++)
            System.out.print(arr[j]+" ");
        System.out.println();
    }
}