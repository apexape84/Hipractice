package com.ogiraffers.prac;

import java.util.Scanner;

public class SH090201 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SelectMenu menu = new SelectMenu();
        int num = 0;

        while(num < 1^num>3) {
            System.out.println("식사할 메뉴의 가격대를 골라주세요");
            System.out.print("1.( 0~5000원 이하), 2.(0~10000원 이하), 3. (0~20000원 이하) : ");
            num = scanner.nextInt();

            if(num < 1^num>3) System.out.println("먹기 싫구나? 다시 골라");
        }

        if (num == 1) menu.under5();
        else if (num == 2) menu.under10();
        else menu.over10();
    }
}
