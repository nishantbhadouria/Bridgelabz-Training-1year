package com.gla.method.level2;

import java.util.Arrays;

public class RandomNumbers {
    public static int[] generateRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random() * 9000) + 1000;
        }
        return numbers;
    }
    public static double[] findAvgMinMax(int[] numbers){
        int min=numbers[0];
        int max=numbers[0];
        int sum=0;
        for(int i=0;i<numbers.length;i++){
            sum+=numbers[i];
            min=Math.min(min,numbers[i]);
            max=Math.max(max,numbers[i]);
        }
        double average = (double)sum/numbers.length;
        return new double[]{min,max,average};
    }
    public static void main(String[] args) {
        int[] numbers=generateRandomArray(5);
        System.out.println("numbers:"+ Arrays.toString(numbers));
        double[] result=findAvgMinMax(numbers);
        System.out.println("Average= "+result[2]);
        System.out.println("Min= "+result[0]);
        System.out.println("Max= "+result[1]);
    }
}
