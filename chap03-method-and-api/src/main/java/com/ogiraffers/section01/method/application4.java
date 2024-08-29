package com.ogiraffers.section01.method;

public class application4 {
    public static void main(String[] args) {
        application4 cal = new application4();
        int num1=5;
        int num2=9;

        int add = cal.Add(num1, num2);
        int sub = cal.Sub(num1, num2);
        int mul = cal.Multi(num1, num2);
        float div = cal.Div(num1, num2);

        System.out.println("add = " + add);
        System.out.println("sub = " + sub);
        System.out.println("mul = " + mul);
        System.out.println("div = " + div);
    }
    public int Add(int a, int b) {
        return a + b;
    }
    public int Sub(int a, int b) {
        return a - b;
    }
    public int Multi(int a, int b) {
        return a * b;
    }
    public float Div(int a, int b) {
        return (float) a / b;
    }
}
