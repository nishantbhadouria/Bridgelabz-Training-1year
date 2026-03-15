package com.gla.method.level1;

import java.util.Scanner;

public class AthleteRounds {
    public static double rounds(double a,double b,double c){
        double perimeter = a+b+c;
        return 5000/perimeter;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sides 1,2 and 3");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double r=rounds(a,b,c);
        System.out.println("Required rounds: "+r);
    }
}
