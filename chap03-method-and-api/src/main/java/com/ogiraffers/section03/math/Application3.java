package com.ogiraffers.section03.math;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력해 주세요 : ");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.println("입력한 값은 : "+a);

        System.out.print("문자열을 입력해 주세요 : ");
        String str = scanner.nextLine();
        System.out.println("입력한 값은 : "+str);
    }
}
