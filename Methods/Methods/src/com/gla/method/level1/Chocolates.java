package com.gla.method.level1;

import java.util.Scanner;

public class Chocolates {
    public static int[]  distribute(int numberOfChocolates,int numberOfStudents){
        int quotient =  numberOfChocolates/numberOfStudents;
        int remainder = numberOfChocolates%numberOfStudents;
        return new int[]{quotient,remainder};
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number and divisor");
        int numberOfChocolates= sc.nextInt();
        int numberOfStudents= sc.nextInt();
        int[] result =  distribute(numberOfChocolates,numberOfStudents);
        System.out.println("Each student gets = "+result[0]);
        System.out.println("Remaining chocolates = "+result[1]);
    }
}
