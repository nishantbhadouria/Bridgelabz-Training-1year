package com.gla.method.level2;

import java.util.Scanner;

public class NaturalSum {
    static int recursiveSum(int n){
        if(n==1){
            return 1;
        }
        return n+recursiveSum(n-1);
    }
    static int formulaSum(int n){
        return n*(n+1)/2;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=recursiveSum(n);
        int f=formulaSum(n);
        System.out.println("Recursive Sum = "+r);
        System.out.println("Formula Sum = "+f);

    }
}
