package com.ogiraffers.section01.practice;

public class party2prac12 {
    public static void main(String[] args) {

        int num1=37;
        int num2=28;
        int num3=0;
        int num4=-4;
        int i=1;

        party2prac12 app = new party2prac12();

        i=app.isEven(num1,i);
        i=app.isEven(num2,i);
        i=app.isEven(num3,i);
        i=app.isEven(num4,i);
    }

    public int isEven(int a,int b) {
        System.out.print("num" + b + " = ");
        System.out.println(a == 0 ? a : (a % 2 == 0) ? a+" 짝수" : a+" 홀수");
        return ++b;
    }
}
