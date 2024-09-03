package com.ogiraffers.prac;

import java.util.Scanner;

public class PH0903_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("어떤문자열? : ");
        String str = scanner.nextLine();

        System.out.print("암호화 계수 : ");
        int passInt=0;
        do {
            if(passInt<0)
                System.out.println("0보다 큰 수를 입력해 주세요");
            passInt = scanner.nextInt();
        }while(passInt<1);

        passInt=passInt%26;

        int i = 0;
        int length = str.length();

        String pass="";
        char c;

        while (i<length) {
            c=str.charAt(i);
            if(c==' '){
                pass=pass+c;
                System.out.println("공백");
            }

            else if(c+passInt>122)
                pass=pass+(char)(c+passInt-26);
            else
                pass=pass+(char)(c+passInt);
            i++;
        }
        System.out.println(pass);
    }
}
