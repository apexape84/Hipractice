package com.ogiraffers.section05.parameter;

public class Apllication {
    public static void main(String[] args) {
        /*매개변수로 사용 사능한 자료형
        * 1. 기본자료형
        * 2. 기본자료형 배열
        * 3. 클래스 자료형
        * 4. 클래스 자료형 배열
        * 5. 가변인자 : 가변인자는 전달하지 않아도 된다.
        * */
        ParameterTest test = new ParameterTest();
        test.testPrimaryParameter(5);

    }
}
