package com.naver.calculrator;

public class Calculrator2 {
    private int a=0;
    private int b=0;
    private char chr='r';

    public Calculrator2(int num1, char chr, int num2) {
        this.a = num1;
        this.b = num2;
        this.chr = chr;
    }

    public void calculrator(){
        switch (chr) {
            case '+':
                System.out.println(a + " + " + b + " = " + (a + b));
                break;

            case '-':
                System.out.println(a + " - " + b + " = " + (a - b));
                break;

            case '*':
                System.out.println(a + " * " + b + " = " + (a * b));
                break;

            case '/':
                System.out.println(a + " / " + b + " = " + (int) (a / b));
                break;

            case '%':
                System.out.println(a + " % " + b + " = " + (a % b));
                break;
        }
    }
}
