package com.ogiraffers.section02.looping;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        A_for aaa = new A_for();
        A_while bbb = new A_while();
        Scanner scanner = new Scanner(System.in);

        //System.out.print("for 숫자? : ");
        //aaa.incNum(scanner.nextInt());

        //System.out.print("while 숫자? : ");
        //bbb.incNum(scanner.nextInt());

        //System.out.print("for 숫자? : ");
        //aaa.randomSum(scanner.nextInt());

        //aaa.googoodan(19);

        //aaa.starTriRe(8);

        //bbb.starTri(8);

        //aaa.starDia(7);

        //bbb.starDia(7);

        //aaa.starPiramid(8);

        //bbb.starPiramid(8);

        aaa.snadClock(7);

        bbb.snadClock(7);

        //bbb.googoodan(9);

        //bbb.starTriRe(8);
    }
}
