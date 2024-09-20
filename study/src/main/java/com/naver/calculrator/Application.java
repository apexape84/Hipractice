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

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // 스캐너
        ExceptionCheck ex = new ExceptionCheck();    // 예외처리를 위한 메소드 모음
        Calculrator cal = new Calculrator();    // 연산식 모음

        int num1=0; // 피연산자1
        String chr="";  // 연산자를 받기위한 변수
        int num2=0; // 피연산자2

        do {    // 계산기를 반복해서 사용하기 위해 do while이용
            System.out.println("숫자를 입력해 주세요");
            num1 = scanner.nextInt();
            scanner.nextLine(); // nextInt를 받고나면 줄바꿈기호가 남는다. 그걸 무효화.

            do { //연산자를 입력 받는다
                System.out.println("연산자(+,-,*,/,%)를 입력해 주세요(종료를 원하시면 x를 입력해주세요)");
                // 시키는대로 해라
                try {
                    chr = scanner.nextLine();
                    ex.checkCommand(chr, num1); // 시키는대로 했는지 확인
                    break; // 시키는대로 했을때 반복문을 종료함
                } catch (Exception e) {
                    System.out.println(e.getMessage()); // 시키는대로 하지 않으면 메세지를 출력
                }
            } while (true); // 다시 입력해라

            do { //숫자를 입력 받는다
                System.out.println("숫자를 입력해 주세요");
                try {
                    num2 = scanner.nextInt();
                    scanner.nextLine(); // 숫자 입력후 줄바꿈문자 무효화
                    ex.checkNum(chr, num2); // 숫자가 쓸만한지 체크. 위에서 입력받은 연산자에 따라 다르므로 연산자도 같이 보냄
                    break;  // 제대로 입력 됐으면 반복 안함
                } catch (Exception e) {
                    System.out.println(e.getMessage()); // 잔소리 출력
                }
            } while (true); // 잔소리 들었으면 다른 숫자 입력

            switch (chr.charAt(0)) {    // 연산자를 받아온다
                case '+':
                    cal.add(num1, num2);
                    break;

                case '-':
                    cal.sub(num1, num2);
                    break;

                case '*':
                    cal.mul(num1, num2);
                    break;

                case '/':
                    cal.div(num1, num2);
                    break;

                case '%':
                    cal.rmn(num1, num2);
                    break;
            }

            System.out.println("r:다시하기, 나머지 입력 : 종료");
            chr = scanner.nextLine();
        }while(chr.charAt(0)=='r'); // 계산기를 다시하는 조건
    }
}
