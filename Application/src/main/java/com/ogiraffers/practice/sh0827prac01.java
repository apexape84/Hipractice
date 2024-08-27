package com.ogiraffers.practice;

public class sh0827prac01 {
    public static void main(String[] args) {
        int elevator = 1000;    // 엘리베이터 용량
        int people = elevator/76;   // 엘리베이터에 탈 수 있는 76kg의 사람 수. 사람수는 정수여야 함

        System.out.println(people+"명");
        System.out.println((double)elevator/people+"kg");   // 평균을 정수로 표현하면 오차가 커지므로 실수로 변환



    }
}
