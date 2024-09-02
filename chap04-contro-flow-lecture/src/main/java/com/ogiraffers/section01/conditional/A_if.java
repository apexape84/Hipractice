package com.ogiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {
    Scanner scanner = new Scanner(System.in);

    public void checkOddNum(){
        System.out.print("숫자를 입력해 주세요 : ");
        int num = scanner.nextInt();

        if(num<0){
            System.out.println("음수입니다.");
        }
        else if(num%2==0){
            System.out.println("짝수입니다.");
        }
        else System.out.println("홀수입니다.");

        System.out.println("끝");
    }
}
