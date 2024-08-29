package com.ogiraffers.section01.method;
// mothod에 전달인자 보내기
public class application3 {
    public static int a = 1;
    public static void main(String[] args) {
        application3 app3 = new application3();
        System.out.println("a="+ a);

        int a = 2;
        app3.testMethod(a);
        app3.testMethod(a);
        app3.testMethod(a);

    }
    public void testMethod(int a) {
        System.out.println("나야 나 테스트 메소드");
        System.out.println(a++);
    }
}
