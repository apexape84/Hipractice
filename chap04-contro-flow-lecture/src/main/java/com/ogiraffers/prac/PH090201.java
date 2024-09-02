package com.ogiraffers.prac;

import java.util.Scanner;

public class PH090201 {
    public static void main(String[] args) {
        System.out.println("나이가 어떻게 되세요?");
        Scanner scanner = new Scanner(System.in);
        if(scanner.nextInt()<20){
            System.out.println("판매불가");
        }
        else System.out.println("판매가능");
        System.out.println();


        System.out.println("어떤수가 홀수인지 짝수인지 궁금하죠?");
        if(scanner.nextInt()%2==0) {
            System.out.println("짝수입니다");
        }
        else System.out.println("홀수입니다");
        System.out.println();


        System.out.println("1~10중에 번호를 하나 뽑으면 선물을 드려요");
        int a =scanner.nextInt();
        if(a<1^a>10){
            System.out.println("탈락입니다");
        }
        else if(a%2==0) {
            System.out.println("모자 당첨되셨습니다");
        }
        else System.out.println("인형 당첨되셨습니다");
        System.out.println();

        System.out.print("키가 어떻게 되세요?(m) : ");




        double height = scanner.nextDouble();
        System.out.print("몸무게는 어떻게 되세요?(kg) : ");
        double weight = scanner.nextDouble();
        scanner.nextLine();

        double bmi=weight/height/height;

        if(bmi<20)
            System.out.println("저체중입니다. 축제음식을 왕창 드세요");

        else if(bmi<25)
            System.out.println("정상체중입니다. 즐거운 축제 되세요");

        else if(bmi<30)
            System.out.println("축제에서 10,000보를 걷고 오시면 상품을 드려요");
        else System.out.println("댄싱부스에 참가하시고 도장을 받아오시면 선물을 드려요");
        System.out.println();


        System.out.println("어떤걸로 드릴까요?");
        System.out.println("caramel popcorn, churros, grilled potato, dotori tanghuru");
        String menu = scanner.nextLine();

        switch (menu){
            case "caramel popcorn" :
                System.out.println(menu+" : 15,500원");
                break;

            case "churros" :
                System.out.println(menu+" : 3,000원");
                break;

            case "grilled potato" :
                System.out.println(menu+" : 2,000원");
                break;

            case "dotori tanghuru" :
                System.out.println(menu+" : 5,000원");
                break;
        }


        int ssPoint;
        int svcPoint;
        int msPoint;
        a=0;

        System.out.print("성실점수 : ");
        ssPoint =scanner.nextInt();
        System.out.print("서비스점수 : ");
        svcPoint =scanner.nextInt();
        System.out.print("미소점수 : ");
        msPoint =scanner.nextInt();
        scanner.nextLine();

        int totalPoint=ssPoint+svcPoint+msPoint;

        if(ssPoint<40){
            System.out.print("성실점수 미달 ");
            a++;
        }
        if(svcPoint<40){
            System.out.print("서비스점수 미달 ");
            a++;
        }
        if(msPoint<40){
            System.out.print("미소점수 미달 ");
            a++;
        }
        if(totalPoint>179&&a==0){
            System.out.println("합격입니다");
        }
        else if(a==0) System.out.println("평균점수미달로 불합격 입니다.");
        else System.out.println("로 불합격입니다.");

        System.out.print("월 급여 : ");
        svcPoint =scanner.nextInt();
        System.out.print("월 매출 : ");
        msPoint =scanner.nextInt();

        if(msPoint>=50000000) ssPoint=5;
        else if(msPoint>=30000000)  ssPoint=3;
        else if(msPoint>=10000000)  ssPoint=1;
        else ssPoint=0;

        System.out.println("이번달 매출은 : "+msPoint);
        System.out.println("그에 따른 보너스율은 : "+ssPoint+'%');
        System.out.println("이번달 급여는 : "+svcPoint);
        msPoint=ssPoint*msPoint/100;
        System.out.println("보너스 금액은 : "+msPoint);
        System.out.println("===================================");
        System.out.println("총 급여는 : "+(svcPoint+msPoint));

        System.out.print("나이 : ");
        svcPoint =scanner.nextInt();
        System.out.print("키(cm) : ");
        msPoint =scanner.nextInt();

        if(svcPoint<9) {
            if(msPoint >= 110) System.out.println("9살이 넘으면 오세요");
            else System.out.println("9살 넘어서 키도 110cm넘기고 와야돼요");
        }
        else if(msPoint >=110)System.out.println("이용가능합니다.");
        else System.out.println("키가 110cm이상 되면 오세요");
        scanner.nextLine();


        System.out.println("어떤차를 빌리나요?");
        System.out.println("A, C, S, SUV, VAN");
        menu = scanner.nextLine();
        switch(menu){
            case "a","A" : System.out.println("4만원");
                break;

            case "c","C" : System.out.println("5만5천원");
                break;

            case "s","S" : System.out.println("8만원");
                break;

            case "suv","SUV" : System.out.println("10만원");
                break;

            case "van","Van" : System.out.println("12만원");
                break;

            default: System.out.println("잘 못 입력하셨습니다");
        }


        System.out.print("지금은 몇 월인가요? : ");
        msPoint =scanner.nextInt();

        switch (msPoint){
            case 12, 1, 2 :
                System.out.println("겨울");
                scanner.nextLine();
                System.out.print("현재기온은 몇 도 입니까? : ");
                svcPoint=scanner.nextInt();
                if(svcPoint<=-15){
                    System.out.println("한파경보");
                }
                else if(svcPoint<=-5)
                    System.out.println("한파주의보");
                break;

            case 3, 4, 5 : System.out.println("봄"); break;

            case 6, 7, 8 :
                System.out.println("여름");
                scanner.nextLine();
                System.out.print("현재기온은 몇 도 입니까? : ");
                svcPoint=scanner.nextInt();
                if(svcPoint>=33){
                    System.out.println("폭염경보");
                }
                else if(svcPoint>=28)
                    System.out.println("폭염주의보");
                break;

            case 9, 10, 11 : System.out.println("가을");break;
        }
    }
}
