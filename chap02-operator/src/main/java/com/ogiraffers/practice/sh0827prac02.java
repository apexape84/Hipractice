package com.ogiraffers.practice;

public class sh0827prac02 {
    public static void main(String[] args) {
        int studentNo = 67;

        /* 증감연산자를 사용하지 않음
        System.out.println("현재 소세지 소비량 = "+studentNo*3 + "개");
        studentNo = studentNo+1;
        System.out.println("다음학생번호는 = " + studentNo);

        또는

        System.out.println("현재 소세지 소비량 = "+studentNo*3 + "개");
        studentNo += studentNo; // 대입연산자를 이용해서 용량 1바이트 줄임
        System.out.println("다음학생번호는 = " + studentNo);

         */
        System.out.println("현재 소세지 소비량 = "+studentNo++*3 + "개");
        System.out.println("다음학생번호는 = " + studentNo);
        //라인을 1줄 줄임

        /*
        System.out.println("현재 소세지 소비량 = "+studentNo++*3 + "개\n"+"다음학생번호는 = " + studentNo);
        라인을 1줄 더 줄였지만 가로로 너무 길어서 한눈에 보이지 않음
         */
    }
}
