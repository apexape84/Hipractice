package com.ogiraffers.section01.practice.prac0829;

public class IntComma {
    public static void main(String[] args) {
        int a = 6089;
        IntComma app = new IntComma();

        app.intComma(a);
    }
    public void intComma(int a){
        // 최대 9자리 숫자를 3자리 단위로 콤마를 넣어 출력해주는 메소드
        int mil=a/1000000;  // 100만 자리의 숫자
        int thousand=a%1000000/1000;    // 천의자리 숫자
        int hundred=a%1000; // 일의자리 숫자
        System.out.print(mil>0?mil+",":"");
        // 백만자리 숫자가 있으면 a를 백만으로 나눈 몫과 ","를 출력
        // :백만자리 숫자가 없으면 출력없음
        System.out.print(mil>0?(thousand>99?thousand+",":thousand>9?"0"+thousand+",":(thousand>0?"00"+thousand+",":"000,")):thousand>0?thousand+",":"");
        //백만자리의 숫자가 있고
        // :십만자리 숫자가 있으면 천의자리 숫자와 ","를 출력
        // :십만자리 숫자가 없고
        //  :만의자리 숫자가 있으면 "0"과 천의자리 숫자와 ","를 출력
        //  :만의자리 숫자도 없으면 "00"과 천의자리 숫자와 ","를 출력
        //   :천의자리 숫자가 없으면 "000"과 ","를 출력
        //:백만자리의 숫자가 없고
        // :천의자리 숫자가 있으면 천의자리 숫자를 출력
        // :천의자리 숫자가 없으면 출력없음
        System.out.print(thousand>0?(hundred>99?hundred//천의자리 숫자가 있고 백의자리 숫자가 있으면 일의자리 숫자출력
                :hundred>9?"0"+hundred  //:백의자리 숫자가 없고 십의자리 숫자가 있으면 "0"과 일의자리 숫자출력
                :hundred>0?"00"+hundred //:십의자리 숫자가 없고 일의자리 숫자가 있으면 "00"과 일의자리 숫자출력
                :"000") //:일의자리 숫자가 없으면 "000"출력
                :hundred);  //:천의자리 숫자가 없으면 일의자리 숫자출력
    }
}
