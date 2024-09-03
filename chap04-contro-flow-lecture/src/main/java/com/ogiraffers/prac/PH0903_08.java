package com.ogiraffers.prac;

import java.util.Random;
import java.util.Scanner;

public class PH0903_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int ran = random.nextInt(1,100);
        int get = 0;
        int count = 1;

        while(true){
            System.out.print("정수를 입력하세요 : ");
            get = scanner.nextInt();
            if (ran==get)
                break;
            if (ran < get)
                System.out.println("입력하신 정수보다 작습니다.");
            else if (ran > get)
                System.out.println("입력하신 정수보다 큽니다");
            count++;
        }
        System.out.println("정답입니다."+ count + "회만에 맞췄습니다.");

    }
}
