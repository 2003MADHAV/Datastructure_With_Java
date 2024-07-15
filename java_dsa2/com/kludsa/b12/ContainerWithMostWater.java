package com.kludsa.b12;
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] heights = {7,2,6,8,4,5};
        int start = 0;
        int end  = heights.length-1;
        int maxArea = 0;
        while(start<end){
            int area = Math.min(heights[start],heights[end])*(end-start);
            if(area>maxArea)
                maxArea = area;
            if(heights[start]<heights[end])
                start++;
            else
                end--;
        }
        System.out.println("MaxArea of Containrer: "+maxArea);
    }
}