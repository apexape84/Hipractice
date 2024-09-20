package com.ohgiraffers.section03.override;

import java.io.IOException;

public class SubClass extends SuperClass{

    /* 같은 예외처리 수준은 오버라이딩 가능
    @Override
    public void overrideTestMethod() throws IOException {}*/

    /* 부모보다 낮은 단계(구체적인) 예외처리 오버라이딩 가능
    @Override
    public void overrideTestMethod(){};*/

    /* 부모의 예외처리 단계보다 높은 단계일시 오버라이딩 불가능
    @Override
    public void overrideTestMethod() throws Exception {}*/

}
