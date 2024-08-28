package com.ogiraffers.section01.practice;

public class ej0828prac01 {
    public static void main(String[] args) {
        ej0828prac01 tour = new ej0828prac01();

        int tour0801A = 0;
        int tour0801B = 0;
        int tour0810A = 5;
        int tour0820B = 3;

        tour.printTourDay(8,1);
        tour.printYesOrNoA(tour0801A,tour0801B);
        tour.printYesOrNoB(tour0801B);

        tour.printTourDay(8,18);
        tour.printYesOrNoA(tour0801A+tour0810A,tour0801B);
        tour.printYesOrNoB(tour0801B);

        tour.printTourDay(8,20);
        tour.printYesOrNoA(tour0801A+tour0810A,tour0801B+tour0820B);
        tour.printYesOrNoB(tour0801B+tour0820B);
    }

    private void printTourDay(int month,int day){
        System.out.println(month+"월 "+day+"일 : ");
    }
    private void printYesOrNoA(int a, int b){
        System.out.print("A여행사 패키지 " + a + " / 8명");
        System.out.println(a<1?"(출발취소)":(a+b)<8?"(출발대기)":"(출발확정)" );
    }
    private void printYesOrNoB(int b){
        System.out.print("B여행사 패키지 " + b + " / 5명");
        System.out.println(b<1?"(출발취소)":b<5?"(출발대기)":"(출발확정)" );
    }
}
