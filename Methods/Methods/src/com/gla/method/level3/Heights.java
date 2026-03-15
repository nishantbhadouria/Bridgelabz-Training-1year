package com.gla.method.level3;

import java.util.Arrays;

public class Heights {
    public static int findSum(int[] heights){
        int sum=0;
        for(int i=0;i<heights.length;i++){
            sum+=heights[i];
        }
        return sum;
    }
    public static double findMean(int[] heights){
        int sum=findSum(heights);
        return (double)sum/heights.length;
    }
    public static int findShortest(int[] heights){
        int min=heights[0];
        for(int i=0;i<heights.length;i++){
            if(heights[i]<min){
                min=heights[i];
            }
        }
        return min;
    }
    public static int findTallest(int[] heights){
        int max=heights[0];
        for(int i=0;i<heights.length;i++){
            if(heights[i]>max){
                max=heights[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        int[] heights=new int[11];
        for(int i=0;i<11;i++){
            heights[i]=(int)(Math.random()*101)+150;
        }
        System.out.println("Height of players:"+ Arrays.toString(heights));
        int sum=findSum(heights);
        double mean=findMean(heights);
        double shortest=findShortest(heights);
        int tallest=findTallest(heights);
        System.out.println("Sum = "+sum);
        System.out.println("The mean is "+mean);
        System.out.println("The shortest is "+shortest);
        System.out.println("The tallest is "+tallest);
    }
}
