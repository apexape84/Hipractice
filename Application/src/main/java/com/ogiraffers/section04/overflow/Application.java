package com.ogiraffers.section04.overflow;

public class Application {
    public static void main(String[] args) {
        byte byteNum = 127;
        System.out.println(byteNum+"+1="+(++byteNum));
        System.out.println(byteNum+"-1="+(--byteNum));

        int firstNum = 100000000;
        int secondNum = 7000;

        long result = firstNum * secondNum;

        System.out.println("1억 x 7천 = " + result);

        System.out.println("1억 x 7천 = " +(long)firstNum*(long)secondNum);

    }
}
