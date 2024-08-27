package com.ogiraffers.practice;

public class ph0827prac01 {
    public static void main(String[] args) {
        int regNo = 840412;
        System.out.println("주민번호 = " + regNo);

        int i = 100;
        long l = 1000L;
        final float PI = 3.14f;

        System.out.println("상수는 PI = " + PI);
        System.out.println("변수는 i = " + i+" , l = " + l);
        System.out.println("리터럴은 전부 다");

        byte b=65;
        char ch=(char)b;
        short s= (short)ch;
        i=ch;

        System.out.println("ch = " + ch);
        System.out.println("s = " + s);
        System.out.println("i = " + i);

    }
}
