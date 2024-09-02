package com.ogiraffers.prac;

import java.util.Random;

public class SelectMenu {
    Random random = new Random();

    public void under5(){
        int a = random.nextInt(8);
        if (a == 0) System.out.print("꼬숑돈까스 ");
        else if (a == 1) System.out.print("별당김치찜 ");
        else if (a == 2) System.out.print("아마노라멘 ");
        else if (a == 3) System.out.print("신촌수제비 ");
        else if (a == 4) System.out.print("역전우동 ");
        else if (a == 5) System.out.print("미정국수 ");
        else if (a == 6) System.out.print("롤링파스타 ");
        else System.out.print("편의점 ");
    }

    public void under10(){
        int a = random.nextInt(17);
        if (a == 0) System.out.print("나주식당 ");
        else if (a == 1) System.out.print("롤링파스타 ");
        else if (a == 2) System.out.print("독립문설렁탕 ");
        else if (a == 3) System.out.print("이석덕생면파스타 ");
        else if (a == 4) System.out.print("틈새라면 ");
        else if (a == 5) System.out.print("역전우동 ");
        else if (a == 6) System.out.print("이가네설렁탕 ");
        else if (a == 7) System.out.print("미정국수 ");
        else if (a == 8) System.out.print("엠브로돈까스 ");
        else if (a == 9) System.out.print("싸움의고수 ");
        else if (a == 10) System.out.print("홍콩반점 ");
        else if (a == 11) System.out.print("뉴욕비앤씨 ");
        else if (a == 12) System.out.print("오빠네옛날떡볶이 ");
        else if (a == 13) System.out.print("부탄츄 ");
        else if (a == 14) System.out.print("카라멘야 ");
        else if (a == 15) System.out.print("홍대돈부리 ");
        else System.out.print("햄버거 ");

    }
    public void over10(){
        int a = random.nextInt(10);
        if (a == 0) System.out.print("가문의우동 ");
        else if (a == 1) System.out.print("소담식당 ");
        else if (a == 2) System.out.print("고삼이 ");
        else if (a == 3) System.out.print("미도인 ");
        else if (a == 4) System.out.print("여우골초밥 ");
        else if (a == 5) System.out.print("미분당쌀국수 ");
        else if (a == 6) System.out.print("삼미당 ");
        else if (a == 7) System.out.print("멘지 ");
        else if (a == 8) System.out.print("김판석 ");
        else System.out.print("아웃백 ");
    }
}
