package com.ogiraffers.section01.arithmetic;
//title. 산술연산자
public class application1 {
    public static void main(String[] args) {
        int firstNum = 20;
        int result1 = firstNum++*3; // 후위연산자는 수식의 연산 종료 후 증감연산을 한다

        System.out.println("result1 = " + result1);
        System.out.println("firstNum = " + firstNum);

        int secondNum = 20;
        int result2 = ++secondNum*3;

        System.out.println("result2 = " + result2); // 전위연산자는 사칙연산보다 우선순위가 높다
        System.out.println("secondNum = " + secondNum);



    }
}
