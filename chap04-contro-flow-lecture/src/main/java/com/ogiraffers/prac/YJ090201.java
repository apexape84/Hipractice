package com.ogiraffers.prac;

import java.util.Random;
import java.util.Scanner;

public class YJ090201 {
    public static void main(String[] args) {

        Random random = new Random();

        int a = random.nextInt(10);

        if (a == 0) System.out.print("한식");
        else if (a == 1) System.out.print("중식");
        else if (a == 2) System.out.print("일식");
        else if (a == 3) System.out.print("양식");
        else if (a == 4) System.out.print("분식");
        else if (a == 5) System.out.print("베이커리");
        else if (a == 6) System.out.print("샐러드");
        else if (a == 7) System.out.print("동남아");
        else if (a == 8) System.out.print("패스트푸드");
        else System.out.print("편의점간편식");
    }
}
