package com.ogiraffers.prac;

public class PH0903_11 {
    public static void main(String[] args) {
        int total=100000;
        int price=22340;
        int change=total-price;
        int thousand=change/1000;
        int hundred=change%1000;
        int a=0;

        if(thousand>0) {
            while (thousand!=0) {
                if (thousand >= 50) {
                    System.out.print(50);
                    a = thousand / 50;
                    thousand = thousand%50;

                } else if (thousand >= 10) {
                    System.out.print(10);
                    a = thousand / 10;
                    thousand = thousand%10;

                } else if (thousand >= 5) {
                    System.out.print(5);
                    a = thousand / 5;
                    thousand = thousand%5;

                } else if (thousand > 0) {
                    System.out.print(1);
                    a = thousand;
                    thousand = 0;
                }

                System.out.println(",000원권 지폐 " + a + "장");
            }
        }

        while (hundred > 0) {
            if (hundred >= 500) {
                System.out.print(50);
                a = hundred / 500;
                hundred = hundred % 500;

            } else if (hundred >= 100) {
                System.out.print(10);
                a = hundred / 100;
                hundred = hundred % 100;

            } else if (hundred >= 15) {
                System.out.print(5);
                a = hundred / 50;
                hundred = hundred % 50;

            } else if (hundred >= 10) {
                System.out.print(1);
                a = hundred /10;
                hundred = 0;
            }
            System.out.println("0원권 동전 " + a + "개");
        }

        System.out.println("거스름돈 : "+ change+"원");
    }
}
