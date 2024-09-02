package com.ogiraffers.section02.looping;

import java.util.Random;

public class A_for {
    public void incNum(int a){
        for(int i=1;i<(a+1);++i)
            System.out.print(i+" ");
        System.out.println();
    }

    public void randomSum(int a){

        Random random = new Random();
        int sum=0;
        for(int i=0;i<a;++i) {
            int g = random.nextInt(5,10);
            System.out.println(sum+"+"+g+"=" );
            sum=sum+g;
            System.out.println(sum);
        }

    }

}
