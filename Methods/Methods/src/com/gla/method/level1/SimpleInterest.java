package com.gla.method.level1;

import java.util.Scanner;

public class SimpleInterest {
    public static double calculateSI(double p,double r,double t){
        return (p*r*t)/100;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principal,rate of interest and time");
        double p=sc.nextDouble();
        double r=sc.nextDouble();
        double t=sc.nextDouble();
        double SI= calculateSI(p,r,t);
        System.out.println("The simple interest is: "+SI+" for principal "+p+" and rate of interest "+r+" and time "+t);
    }
}
