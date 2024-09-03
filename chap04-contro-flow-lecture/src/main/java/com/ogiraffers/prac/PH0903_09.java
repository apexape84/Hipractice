package com.ogiraffers.prac;

import java.util.Scanner;

public class PH0903_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("어떤문자열? : ");
        String str = scanner.nextLine();

        System.out.print("어떤문자? : ");
        char c = scanner.nextLine().charAt(0);
        int i = 0;
        int count = 0;
        int length = str.length();

        while (i<length) {
            if (str.charAt(i) == c) count++;
            else if (str.charAt(i) < 65 || str.charAt(i) > 122){
                System.out.println("영문자가 아닌 문자가 포함되어 있습니다.");
                break;
            }

            i++;
        }
        if(i==length)
            System.out.println(c + "는 : " + count + "개");
    }
}
