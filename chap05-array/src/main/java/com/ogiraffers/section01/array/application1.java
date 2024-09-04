package com.ogiraffers.section01.array;

import java.util.Arrays;
import java.util.Scanner;

public class application1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];
        double sum=0;
        double max=0;

        for(int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
            sum=sum+arr[i];
            max=max<arr[i]?arr[i]:max;
        }

        System.out.println(max);
        System.out.println(sum/arr.length);
    }
}
