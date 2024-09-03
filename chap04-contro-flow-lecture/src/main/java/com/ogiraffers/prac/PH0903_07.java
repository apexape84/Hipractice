package com.ogiraffers.prac;

import java.util.Scanner;

public class PH0903_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=0;

        System.out.print("정수를 입력해 주세요 : ");
        num=scanner.nextInt();


        while(num<2){
            System.out.print("2보다 큰 정수를 입력해 주세요 : ");
            num=scanner.nextInt();
        }

        int count=0;
        for(int i=2;i<num;i++) {
            count = num % i == 0 ? 1 : 0;
            if (count > 0){
                System.out.println("소수가 아닙니다.");
                break;
            }
        }
        if(count==0)
            System.out.println("소수입니다.");
    }
}
