package com.ogiraffers.section01.practice.prac0829;

public class Account {
    public int inputAcc(int acc, int input){
        return acc + input;
    }   // 계좌에 입금액을 더해주는 메소드
    public int outputAcc(int acc, int output){
        return acc - output;
    }   // 계좌에 출금액을 빼주는 메소드
    public int interAcc(int acc, int inter){
        double dAcc = (double)acc*(100+inter)/100;  // 이자가 소수점으로 나올 수 있으므로 실수로

        return dAcc%1==0?acc*(100+inter)/100:acc*(100+inter)/100+1;
        //이자를 계산하고 계좌 잔고에 소수점 아래 금액을 올림해서 통장 잔액을 돌려주는 메소드
    }
    public void intComma(int a){
        // 최대 9자리 숫자를 3자리 단위로 콤마를 넣어 출력해주는 메소드

        int mil=a/1000000;  // 100만 자리의 숫자
        int thousand=a%1000000/1000;    // 천의자리 숫자
        int hundred=a%1000; // 일의자리 숫자

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

        System.out.print((mil>0)|(thousand>0)?(hundred>99?hundred
                //백만이나 천의자리 숫자가 있고 백의자리 숫자가 있으면 일의자리 숫자출력
                :hundred>9?"0"+hundred
                //:백의자리 숫자가 없고 십의자리 숫자가 있으면 "0"과 일의자리 숫자출력
                :hundred>0?"00"+hundred
                //:십의자리 숫자가 없고 일의자리 숫자가 있으면 "00"과 일의자리 숫자출력
                :"000")
                //:일의자리 숫자가 없으면 "000"출력
                :hundred);  //:백만자리와 천의자리 숫자가 없으면 일의자리 숫자출력
    }
}
