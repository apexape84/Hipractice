package com.ogiraffers.section01.practice;

import java.lang.reflect.Array;

public class sh0829prac01 {
    public static void main(String[] args) {
        int lineNum=1;

        sh0829prac01 a = new sh0829prac01();

        lineNum=a.printApp(lineNum,"이승현",50,66,74);
        lineNum=a.printApp(lineNum,"정은미",37,67,73);
        lineNum=a.printApp(lineNum,"문정현",85,85,82);
        lineNum=a.printApp(lineNum,"윤이정",61,34,89);
        lineNum=a.printApp(lineNum,"박재민",66,88,99);
        lineNum=a.printApp(lineNum,"김경훈",97,100,24);
        lineNum=a.printApp(lineNum,"조평훈",0,0,0);
    }

    private int printApp(int l,String name,int k, int e, int m){
        System.out.println(l+"."+name+" 국어: "+k+" 영어: "+e+" 수학: "+ m);
        return ++l;
    }
}

