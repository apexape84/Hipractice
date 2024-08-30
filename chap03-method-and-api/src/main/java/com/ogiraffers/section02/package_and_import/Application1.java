package com.ogiraffers.section02.package_and_import;

import com.ogiraffers.section01.practice.prac0829.IntComma;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        IntComma a = new IntComma();

        Scanner scanner = new Scanner(System.in);

        System.out.print("10억 미만의 정수를 입력해주세요 :");
        a.intComma(scanner.nextInt());
    }
}
