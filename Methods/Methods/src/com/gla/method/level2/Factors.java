package com.gla.method.level2;

import java.util.Arrays;
import java.util.Scanner;

public class Factors {
    static int[] findFactors(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        int factors[]=new int[count];
        int index=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                factors[index++]=i;
            }
        }
        return factors;
    }
    static int sum(int arr[]){
        int sum=0;
        for(int x:arr)
            sum+=x;
        return sum;
    }
    static int product(int arr[]){
        int product = 1;
        for(int x:arr)
            product*=x;
        return product;
    }
    static double squareSum(int arr[]){
        int sum = 0;
        for(int x:arr)
            sum+=Math.pow(x,2);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int factors[]=findFactors(n);
        System.out.println("Factors: "+ Arrays.toString(factors));
        System.out.println("Sum = "+sum(factors));
        System.out.println("Product = "+product(factors));
        System.out.println("Square Sum = "+squareSum(factors));
    }
}
