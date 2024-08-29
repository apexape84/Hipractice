package com.ogiraffers.section01.practice;

public class EM0829prac01 {


    public static void main(String[] args) {
        int height = 170;
        int weight = 80;
        float sight = 1.5f;

        EM0829prac01 p = new EM0829prac01();
        p.print(height, weight, sight);

    }

    public void print(int h, int w, float s) {
        System.out.print("저의 키는 "+h+"이고, 몸무게는 "+w+"이고, 시력은 ");
        System.out.printf("%.1f",s);
        System.out.println("입니다.");
    }
}


