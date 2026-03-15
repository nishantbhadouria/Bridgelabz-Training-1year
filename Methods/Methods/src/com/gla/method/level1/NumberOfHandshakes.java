package com.gla.method.level1;

import java.util.Scanner;

public class NumberOfHandshakes {
    public static int maxHandshakes(int n){
        return n*(n-1)/2;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students");
        int n=sc.nextInt();
        System.out.println("Maximum number of handshakes is: "+maxHandshakes(n));
    }
}
