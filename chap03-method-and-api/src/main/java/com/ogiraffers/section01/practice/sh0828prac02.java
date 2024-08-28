package com.ogiraffers.section01.practice;

public class sh0828prac02 {
        public static void main(String[] args) {
            System.out.println("인사하는 프로그램 시작합니다.");

            sh0828prac02 app2 = new sh0828prac02(); // 클래스 생성
            app2.callName("은미");  // 이름을 출력하는 메소드에 "은미"를 입력하여 호출
            app2.hello();   // "님 안녕하세요?"를 출력하는 메소드 호출
            app2.callName("정현");
            app2.hello();
            app2.callName("이정");
            app2.hello();
            app2.callName("승현");
            app2.hello();

            System.out.println("안녕히 가세요");
        }
        private void hello() {
            System.out.println("님 안녕하세요?");
        }

        private void callName(String a) {
            System.out.print(a);
        };

    }

