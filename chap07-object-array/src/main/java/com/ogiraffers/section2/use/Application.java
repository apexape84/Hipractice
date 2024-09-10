package com.ogiraffers.section2.use;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        /* title. DTO(데이터 위주)와 행위 위주의 클래스를 활용한 예제 */

        /* comment.
         *   DTO 를 활용한 간단한 회원 관리용 프로그램
         *   1. Application 에서 플레이어가 여러 명의 회원 정보를 받아 등록
         *   2. Application 에서 플레이어가 전체 회원 조회 시 등록 된 회원 정보 반환
         *  */

        // 스캐너 인스턴스 생성
        Scanner sc = new Scanner(System.in);
        // 멤버매니저 인스턴스 생성
        MemberManager manager = new MemberManager();


        // 프로그램을 끄기 전까지 계속해서 실행되는 메뉴 생성 (메뉴 1. 회원등록. 2. 조회 3.종료)
        while (true) {
            System.out.println("==========HiMedia 회원 관리 프로그램===========");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 전체 조회");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 선택 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 :
                    manager.signUpMembers();
                    break;
                case 2 :
                    manager.searchAllMember();
                    break;
                case 9 :
                    System.out.println("프로그램을 종료합니다. 다시 이용해주세요^^");
                    return;
                default:
                    System.out.println("없는 메뉴입니다. 다시 입력해주세요");
                    break;
            }

        }


    }

}