package com.ogiraffers.section01.conditional;

import java.util.Scanner;

public class Calculator {
    Scanner scanner = new Scanner(System.in);
    int a;
    int b;
    char c;

    public void calculator()
    {
        System.out.println("식을 넣으세요");
        a=scanner.nextInt();
        scanner.nextLine();
        c=scanner.nextLine().charAt(0);
        b=scanner.nextInt();

        switch(c) {
            case '+':
                System.out.println("" + a + c + b + "=" + (a + b));
                break;

            case '-':
                System.out.println("" + a + c + b + "=" + (a - b));
                break;

            case '*':
                System.out.println("" + a + c + b + "=" + (a * b));
                break;

            case '/':
                System.out.println("" + a + c + b + "=" + (a / b) + "나머지" + (a % b));
                break;
        }
    }
}
