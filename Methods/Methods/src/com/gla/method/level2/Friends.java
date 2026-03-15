package com.gla.method.level2;

import java.util.Scanner;

public class Friends {
    static int findYoungest(int age[]){
        int min=age[0];
        for(int x:age){
            min=Math.min(min,x);
        }
        return min;
    }
    static int findTallest(int height[]){
        int max=height[0];
        for(int x:height){
            max=Math.max(max,x);
        }
        return max;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int age[]=new int[3];
        int height[]=new int[3];
        for(int i=0;i<3;i++){
            age[i]=sc.nextInt();
        }
        for(int i=0;i<3;i++){
            height[i]=sc.nextInt();
        }
        System.out.println("Youngest age: "+findYoungest(age));
        System.out.println("Tallest age: "+findTallest(height));
    }
}
