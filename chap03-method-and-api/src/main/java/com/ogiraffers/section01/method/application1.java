package com.ogiraffers.section01.method;

public class application1
    {

        public static void main(String[] args) {
        int num1=10;
        int num2=20;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        application1 app1 = new application1();

        System.out.println("num1+num2= "+app1.add(num1,num2));


    }

    public int add(int a, int b)
    {
        return a + b;
    }

}
