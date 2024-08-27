package com.ogiraffers.section05.typecasting;

public class application1 {
    public static void main(String[] args) {
        // title 자동 형변환
        /* 자동형변환(묵시적)
        * 작은 자료형에서 큰 자료형으로
        * 정수는 실수로
        * 문자형은 int형으로
        * 논리형은 형변환 제외
        * */

        byte bnum = 1;
        short snum = bnum;
        int inum = snum;
        long lnum = inum;

        System.out.println("bnum = " + bnum);
        System.out.println("snum = " + snum);
        System.out.println("inum = " + inum);
        System.out.println("lnum = " + lnum);

    }
}
