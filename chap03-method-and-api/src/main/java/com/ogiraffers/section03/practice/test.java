package com.ogiraffers.section03.practice;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        RandomMaker rm = new RandomMaker();
        Scanner scanner = new Scanner(System.in);

        int a;

        System.out.print("대문자 문자열을 몇개 출력할까요?(100개이내) :");
        a=scanner.nextInt();

        System.out.print(a>0?(rm.randomUpperAlpabet2(a)):"음수 안돼");
    }
}
