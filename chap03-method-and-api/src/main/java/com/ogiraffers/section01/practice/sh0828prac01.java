package com.ogiraffers.section01.practice;

import com.ogiraffers.section01.method.application2;

public class sh0828prac01 {
        public static void main(String[] args) {
            System.out.println("인사하는 프로그램 시작합니다.");

            sh0828prac01 app2 = new sh0828prac01(); // 클래스 생성
            app2.callEM();  // 은미님 이름을 출력하는 메소드 호출
            app2.hello();   // "님 안녕하세요?"를 출력하는 메소드 호출
            app2.callJH();
            app2.hello();
            app2.callSH();
            app2.hello();
            app2.callEJ();
            app2.hello();

            System.out.println("안녕히 가세요");
        }
        private void hello() {
            System.out.println("님 안녕하세요?");
        }

        private void callSH() {
            System.out.print("승현");
        };
        private void callEJ() {
            System.out.print("이정");
        };
        private void callJH() {
            System.out.print("정현");
        };
        private void callEM() {
            System.out.print("은미");
        };

    }

