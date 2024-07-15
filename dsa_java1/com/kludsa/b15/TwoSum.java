package com.kludsa.b15;
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,3,5,8,9,10,11};
        int target = 13;
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            if(arr[start]+arr[end]==target){
                System.out.println(arr[start]+" "+arr[end]);
                start++;end--;
            }
            else if(arr[start]+arr[end]<target){
                start++;
            }
            else if(arr[start]+arr[end]>target){
                end--;
            }
        }
    }
}