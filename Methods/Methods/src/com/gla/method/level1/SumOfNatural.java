package com.gla.method.level1;

import java.util.Scanner;

public class SumOfNatural {
    public static int findSum(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
             sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println("Sum = "+findSum(n));
    }
}
