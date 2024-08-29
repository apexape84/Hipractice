package com.ogiraffers.section01.practice.prac0829;

public class Application01 {
    public static void main(String[] args) {
        Calculator app = new Calculator();

        app.checkMethod();

        System.out.println("10과 20의 합 : "+ app.Add(10,20));
        System.out.println("10과 5의 차 : "+ app.Sub(10,5));
        System.out.println("10과 5의 곱 : "+ app.Multi(10,5));
        System.out.println("10을 5로 나눈 몫  : "+ app.Div(10,5));
    }
}
