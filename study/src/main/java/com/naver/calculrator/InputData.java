package com.naver.calculrator;

import java.util.Scanner;

public class InputData {
    Scanner scanner = new Scanner(System.in);
    ExceptionCheck ex = new ExceptionCheck();
    private static char command;
    private static int num1;
    private static int num2;
    private static String chr;

    public InputData() {
    }

    public void getData() {
        System.out.println("숫자를 입력해 주세요");
        num1 = scanner.nextInt();
        scanner.nextLine(); // nextInt를 받고나면 줄바꿈기호가 남는다. 그걸 무효화.

        do { //연산자를 입력 받는다
            System.out.println("연산자(+,-,*,/,%)를 입력해 주세요(종료를 원하시면 x를 입력해주세요)");
            // 시키는대로 해라
            try {
                chr = scanner.nextLine();
                ex.checkCommand(chr, num1); // 시키는대로 했는지 확인
                command=chr.charAt(0);
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
    }

    public static char getCommand () {
        return command;
    }

    public static int getNum1 () {
        return num1;
    }

    public static int getNum2 () {
        return num2;
    }
}
