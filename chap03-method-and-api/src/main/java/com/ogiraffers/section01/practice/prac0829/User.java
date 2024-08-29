package com.ogiraffers.section01.practice.prac0829;

public class User {
    public static void main(String[] args) {
        int account = 0;    // 계좌 초기화
        String name = "현승"; // 계좌주 이름

        Account calAcc = new Account();

        account = calAcc.inputAcc(account, 3000000);
        account = calAcc.outputAcc(account, 600000);
        account = calAcc.outputAcc(account, 50000);
        account = calAcc.outputAcc(account, 150000);
        account = calAcc.inputAcc(account, 200000);
        account = calAcc.inputAcc(account, 2);
        account = calAcc.interAcc(account,10);  // 이자 %로 입력

        System.out.print(name+"이의 통장 잔액은 ");
        calAcc.intComma(account);
        System.out.print(" 원 입니다");
    }
}
