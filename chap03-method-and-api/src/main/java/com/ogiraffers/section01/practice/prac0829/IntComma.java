package com.ogiraffers.section01.practice.prac0829;

public class IntComma {
//    public static void main(String[] args) {
//        IntComma app = new IntComma();
//
//        app.intComma(123456789);
//        app.intComma(456789);
//        app.intComma(789);
//        app.intComma(123056789);
//        app.intComma(56789);
//        app.intComma(123000089);
//        app.intComma(89);
//        app.intComma(123056089);
//        app.intComma(100000000);
//        app.intComma(2640003);
//    }
    public void intComma(int a){
        // 최대 9자리 숫자를 3자리 단위로 콤마를 넣어 출력해주는 메소드
        System.out.println("입력값 = " + a);

        int mil=a<0?a/-1000000:a/1000000;  // 100만 자리의 숫자, 양수로
        int thousand=a<0?a%1000000/-1000:a%1000000/1000;    // 천의자리 숫자, 양수로
        int hundred=a<0?a%1000*-1:a%1000; // 일의자리 숫자, 양수로

        System.out.print(a<0?'-':null);

        System.out.print(mil>0?mil+",":"");
        // 백만자리 숫자가 있으면 a를 백만으로 나눈 몫과 ","를 출력
        // :백만자리 숫자가 없으면 출력없음

        System.out.print(mil>0?(thousand>99?thousand+","
        //백만자리의 숫자가 있고 십만자리 숫자가 있으면 천의자리 숫자와 ","를 출력
            :thousand>9?"0"+thousand+","
            //:십만자리 숫자가 없고만의자리 숫자가 있으면 "0"과 천의자리 숫자와 ","를 출력
                :(thousand>0?"00"+thousand+","
                //:만의자리 숫자도 없으면 "00"과 천의자리 숫자와 ","를 출력
                    :"000,"))
                    //:천의자리 숫자가 없으면 "000"과 ","를 출력
        :thousand>0?thousand+"," //:백만자리의 숫자가 없고 천의자리 숫자가 있으면 천의자리 숫자와 ","를 출력
            :"");// :천의자리 숫자가 없으면 출력없음

        System.out.println((mil>0)|(thousand>0)?(hundred>99?hundred
        //백만이나 천의자리 숫자가 있고 백의자리 숫자가 있으면 일의자리 숫자출력
            :hundred>9?"0"+hundred
            //:백의자리 숫자가 없고 십의자리 숫자가 있으면 "0"과 일의자리 숫자출력
                :hundred>0?"00"+hundred
                //:십의자리 숫자가 없고 일의자리 숫자가 있으면 "00"과 일의자리 숫자출력
                :"000")
                //:십의자리 숫자가 없고 일의자리 숫자가 없으면 "000"출력
        :hundred);  //:백만자리와 천의자리 숫자가 없으면 일의자리 숫자출력
    }
}
