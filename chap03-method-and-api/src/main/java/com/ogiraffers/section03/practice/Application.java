package com.ogiraffers.section03.practice;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        RandomMaker rm = new RandomMaker();
        Scanner scanner = new Scanner(System.in);

        System.out.println("랜덤정수를 추출할 범위를 입력해 주세요 : ");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println(a+" 과(와) "+b+" 사이의 숫자 : "+rm.randomNumber(a,b));

        System.out.print("대문자 문자열을 몇개 출력할까요?(100개이내) :");
        a=scanner.nextInt();
        System.out.println(a>0?(rm.randomUpperAlpabet2(a)):"음수 안돼");

        System.out.println(rm.rockPaperScissors());

        System.out.println(rm.tossCoin());
    }
}
