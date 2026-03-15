package com.gla.method.level1;

import java.util.Scanner;

public class SpringSeason {
    public static boolean isSpring(int month,int day)
    {
        if((month==3 && day>=20)||(month==4)||(month==5)||(month==6 && month<=20))
        {
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month and day");
        int month=sc.nextInt();
        int day=sc.nextInt();
        if(isSpring(month,day))
            System.out.println("Its a Spring Season");
        else
            System.out.println("Not a Spring Season");
    }


}
