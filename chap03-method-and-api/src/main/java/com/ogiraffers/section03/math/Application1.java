package com.ogiraffers.section03.math;

import java.util.Random;

public class Application1 {
    public static void main(String[] args) {
        int a=-7;
        int b=(int)(Math.random()*20-10);

        System.out.println(b);

        System.out.println(a+"의 절대값은 : "+(a>0?a:0-a));
        System.out.println(b+"의 절대값은 : "+(b>0?b:0-b));
    }
}
