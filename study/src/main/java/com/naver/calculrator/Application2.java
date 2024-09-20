package com.naver.calculrator;

import java.util.Scanner;
/*Application 클래스와 Calculrator 클래스 구현
 * Application 클래스에서는 main 메소드 구현
 * Application 클래스에서 Scanner 객체를 사용해서 2 개의 정수, 1 개의 사칙연산 기호를 받는다.
 * 입력 한 정수를 사칙연산 기호에 따라 Calculrator 클래스의 각기 다른 사칙연산 메소드로 전달한다.
 * 사칙연산이 수학적으로 통용되는 상식선에서 정상적으로 돌아가도록 구현
 * 모든 사칙 연산은 정수로 계산되도록 할 것
 * 나누기의 경우 나눌 수 가 0인 경우 사용자 정의의 DivideNotZeroException 이 발생하도록 구현
 * DivideNotZeroException 클래스는 message 로 "나눌 수는 0이 될 수 없습니다" 출력
 * 곱하기의 경우 곱하는 수가 0인 경우 사용자 정의의 MultipleNotZeroException 이 발생하도록 구현
 * MultipleNotZeroException 클래스는 message 로 "곱하는 수는 0이 될 수 없습니다" 출력
 * */

public class Application2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // 스캐너

        String chr;  // 반복명령을 받기위한 변수

        do {
            InputData a = new InputData();
            a.getData();
            Calculrator2 cal = new Calculrator2(a.getNum1(),a.getCommand(),a.getNum2() );
            cal.calculrator();

            System.out.println("r:다시하기, 나머지 입력 : 종료");
            chr = scanner.nextLine();
        } while (chr.charAt(0) == 'r'); // 계산기를 다시하는 조건*
    }
}






