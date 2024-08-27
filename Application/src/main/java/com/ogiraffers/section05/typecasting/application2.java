package com.ogiraffers.section05.typecasting;
// title. 강제 형변환
public class application2 {
    public static void main(String[] args) {
        // 강제형변환(명시적 형변환) 바꾸려는 자료형으로 캐스트 연산자()를 이용
        double dnum = 8.8;
        int inum = (int)dnum;

        System.out.println("dnum = " + dnum);
        System.out.println("inum = " + inum);
    }
}
