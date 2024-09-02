package com.ogiraffers.section02.looping;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        A_for aaa = new A_for();
        //A_while bbb = new A_while();
        Scanner scanner = new Scanner(System.in);

        //System.out.print("for 숫자? : ");
        //aaa.incNum(scanner.nextInt());

        //System.out.print("while 숫자? : ");
        //bbb.incNum(scanner.nextInt());

        System.out.print("for 숫자? : ");
        aaa.randomSum(scanner.nextInt());
    }
}
