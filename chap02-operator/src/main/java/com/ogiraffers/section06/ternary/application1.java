package com.ogiraffers.section06.ternary;
// title. 삼항연산자
public class application1 {
    public static void main(String[] args) {
        int num1=-4, num2=2, num3=0;

        System.out.println(num1 + "은" + (num1>0 ? 1:-1));
        System.out.println(num1<0||(++num2<0));
        System.out.println("num2 = " + num2);

        System.out.println(num1<0&&(++num2<0));
        System.out.println("num2 = " + num2);

        System.out.println(num1<0&&++num3==0);
        System.out.println("num3 = " + num3);
    }
}
