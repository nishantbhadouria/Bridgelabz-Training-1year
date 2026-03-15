package com.gla.method.level2;

import java.util.Scanner;

public class BMICalculator {
    static void findBMI(double[][] data){
        for(int i=0;i<data.length;i++){
            double weight = data[i][0];
            double heightCm=data[i][1];
            double heightMeter=heightCm/100;
            double bmi=weight/(heightMeter*heightMeter);
            data[i][2]=bmi;
        }
    }
    static String[] status(double[][] data){
        String[] status = new String[data.length];
        for(int i=0;i<data.length;i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4)
                status[i]= "Underweight";
            else if (bmi <= 24.9)
                status[i]= "Normal";
            else if (bmi <= 39.9)
                status[i]= "Overweight";
            else
                status[i]= "Obese";
        }
        return status;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double[][] data=new double[10][3];
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter weight in kg");
            data[i][0]=sc.nextDouble();
            System.out.println("Enter height in cm");
            data[i][1]=sc.nextDouble();
        }
        findBMI(data);
        String bmiStatus[]=status(data);
        System.out.println("Weight\tHeight(cm)\tBMI\t\tStatus");
        for(int i=0;i<data.length;i++)
        {
            System.out.printf("%.2f\t%.2f\t\t%.2f\t%s\n",data[i][0],data[i][1],data[i][2],bmiStatus[i]);
        }
        sc.close();
    }
}
