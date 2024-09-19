package com.ohgiraffers.section02.set;

import java.util.HashSet;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        //HashSet<String> hset = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("입력");
        String[] str = new String[5];
        for(int i = 0; i<5;i++)
            str[i] = scanner.next();


        scanner.nextLine().charAt(0);
        System.out.println("str = " + str[1]);
    }
}
