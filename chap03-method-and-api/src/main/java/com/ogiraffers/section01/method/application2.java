package com.ogiraffers.section01.method;

public class application2 {
    public static void main(String[] args) {
        System.out.println("main 시작");
        application2 app2 = new application2();
        app2.methodA();
        app2.methodB();
        app2.methodC();
        System.out.println("main 끝");
    }
    public void methodA() {
        System.out.println("method A 시작");
        System.out.println("method A 끝");
    };
    public void methodB() {
        System.out.println("method B 시작");
        System.out.println("method B 끝");
    };
    public void methodC() {
        System.out.println("method C 시작");
        System.out.println("method C 끝");
    };


}
