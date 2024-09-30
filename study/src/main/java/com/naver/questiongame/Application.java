package com.naver.questiongame;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        int point=0;
        do{
            System.out.println("=============================================================");
            switch (point){
                case 0 : System.out.println("| 0점이라니!! 공부가 필요합니다!!!                               |");
                    break;
                case 1 : System.out.println("|==10=| 앞으로 90점 남았다!!!                                  |");
                    break;
                case 2 : System.out.println("|=====|==20=| 차곡차곡 쌓아가는 재미!!!                         |");
                    break;
                case 3 : System.out.println("|=====|=====|==30=| 기초는 아는구만!!!                         |");
                    break;
                case 4 : System.out.println("|=====|=====|=====|==40=| 곧 중간은 간다!!!                    |");
                    break;
                case 5 : System.out.println("|=====|=====|=====|=====|==50=| 이정도면 코딩해도 되지!!!!      |");
                    break;
                case 6 : System.out.println("|=====|=====|=====|=====|=====|==60=| 마! 니 키보드 좀 치나?   |");
                    break;
                case 7 : System.out.println("|=====|=====|=====|=====|=====|=====|==70=| 점수바에 빈칸이... |");
                    break;
                case 8 : System.out.println("|=====|=====|=====|=====|=====|=====|=====|==80=| 열공했구나! |");
                    break;
                case 9 : System.out.println("|=====|=====|=====|=====|=====|=====|=====|=====|==90=| 곧!! |");
                    break;
                default: System.out.println("|=====| 100점 돌파!! 당신은 저보다 고수입니다! Thank you!!  |=====|");
            }
            point++;
            System.out.println("|=====|=====|=====|=====|=====|=====|=====|=====|=====|=====|");
            System.out.println("=============================================================");
            System.out.println();
            System.out.println("난이도를 골라주세요 1.기본 2.쌩기초 3.기초 4.고양이 5.사람");
            Scanner scanner = new Scanner(System.in);
            // point+=QuestioManager.getQuestion(scanner);

        }while(point>0&&point<11);
    }


}
