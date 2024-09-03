package com.ogiraffers.prac;



import java.util.Scanner;

public class SH0903_1 {
    public static void main(String[] args) {
        A_while bbb = new A_while();
        Scanner scanner = new Scanner(System.in);
        int a;

        do{System.out.println("무엇을 만들까요?");
            System.out.println("1 : 직각삼각형");
            System.out.println("2 : 반대로 된 직각삼각형");
            System.out.println("3 : 피라미드");
            System.out.println("4 : 다이아몬드");
            System.out.println("5 : 모래시계");
            System.out.println("6 : 구구단");
            System.out.println("7 : 계산기 종료");
            a=scanner.nextInt();

            if(a==7) break;

            System.out.println("몇줄 또는 몇단으로 만들까요?");
            int b=scanner.nextInt();

            switch(a){
                case 1 :
                    bbb.starTri(b);
                    break;

                case 2 :
                    bbb.starTriRe(b);
                    break;

                case 3 :
                    bbb.starPiramid(b);
                    break;

                case 4:
                    bbb.starDia(b);
                    break;

                case 5:
                    bbb.snadClock(b);
                    break;

                case 6:
                    bbb.googoodan(b);
                    break;

                default:
                    System.out.println("해당하는 명령이 없습니다.");
            }
        }while(a!=7);
    }
}
