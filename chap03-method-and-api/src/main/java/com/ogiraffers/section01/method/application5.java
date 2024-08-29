package com.ogiraffers.section01.method;

public class application5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        Calculator calc = new Calculator();

        System.out.println(a + "와 " + b + "중 큰 수는 " + calc.maxNum(a, b));
        System.out.println(a + "와 " + b + "중 작은 수는 " + calc.minNum(a, b));
    }
}
