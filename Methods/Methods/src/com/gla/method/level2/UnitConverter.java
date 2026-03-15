package com.gla.method.level2;

import java.util.Scanner;

public class UnitConverter {
    static double convertKmToMiles(double km){
        return km * 0.621371;
    }
    static double convertMilesToKm(double miles){
        return miles * 1.60934;
    }
    static double metersToFeet(double m){
        return m*3.28084;
    }

    static double feetToMeters(double f){
        return f*0.3048;
    }

    static double yardsToFeet(double y){
        return y*3;
    }

    static double feetToYards(double f){
        return f*0.333333;
    }

    static double metersToInches(double m){
        return m*39.3701;
    }

    static double inchesToMeters(double i){
        return i*0.0254;
    }

    static double fahrenheitToCelsius(double f){
        return (f-32)*5/9;
    }

    static double celsiusToFahrenheit(double c){
        return (c*9/5)+32;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km = sc.nextDouble();
        System.out.println(convertKmToMiles(km));
        double miles = sc.nextDouble();
        System.out.println(convertMilesToKm(miles));
        double feet = sc.nextDouble();
        System.out.println(feetToMeters(feet));
        double yards = sc.nextDouble();
        System.out.println(yardsToFeet(yards));
        double inches = sc.nextDouble();
        System.out.println(inchesToMeters(inches));
        double fahrenheit = sc.nextDouble();
        System.out.println(fahrenheitToCelsius(fahrenheit));
        double celsius = sc.nextDouble();
        System.out.println(celsiusToFahrenheit(celsius));
        double meters = sc.nextDouble();
        System.out.println(metersToInches(meters));
    }
}

