package com.kludsa.b15;
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] heights = {4,5,1,2,3,6,7,4,6};
        //int[] heights= {3,1,2,4,5};
        int start=0,end=heights.length-1;
        int area=0,maxArea=0;
        while(start<end){
            area = (Math.min(heights[start],heights[end])*(end-start));
            if(area>maxArea)
                maxArea = area;
            if(heights[start]<heights[end])
                start++;
            else
                end--;
        }
        System.out.println("MaxArea: "+maxArea);
    }
}