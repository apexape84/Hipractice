package com.ogiraffers.section01.copy;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        /* 깊은 복사
        * 1. for문 이용
        * 2. Object의 clone()메소드 - 같은 배열만 생성가능
        * 3. System의 arraycopy() 메소드 - 가장 고성능
        * 4. Array의 copyof() 메소드 - 가장 많이 사용
        *
        * */
        // 글로벌 5210 200
        // 바이오스텝 2485 200
        // 생명과학 11200 40
        // -662

        int numbers[] = {1,2,3,6,7,8};
        for(int a:numbers){
            a+=1;
            System.out.print(a+" ");
        }
        System.out.println();
        for(int a:numbers){
            System.out.print(a+" ");
        }


    }
    /*public static void print(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
        System.out.println();
        int[] b = Arrays.copyOf(a,a.length);
        b[1]=9;
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
        System.out.println();
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]);
        }
    }*/
}
