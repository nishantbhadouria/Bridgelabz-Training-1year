package com.gla.method.level1;

import java.util.Scanner;

public class QuotientRemainder {
    public static int[]  findQuotientRemainder(int number,int divisor){
        int quotient =  number/divisor;
        int remainder = number%divisor;
        return new int[]{quotient,remainder};
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number and divisor");
        int number= sc.nextInt();
        int divisor= sc.nextInt();
        int[] result =  findQuotientRemainder(number,divisor);
        System.out.println("Quotient = "+result[0]);
        System.out.println("Remainder = "+result[1]);
    }
}
