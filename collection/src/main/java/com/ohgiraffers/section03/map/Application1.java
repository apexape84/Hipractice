package com.ohgiraffers.section03.map;

import java.util.HashMap;

public class Application1 {
    public static void main(String[] args) {
        /* map 인터페이스
        * 일반적인 collection 인터페이스와는 다른 저장방식
        * */

        HashMap hmap = new HashMap<>();

        hmap.put(5,34);
        hmap.put((Double)4.8,2398);
        hmap.put(3,12);
        hmap.put(2,34);
        hmap.put((Double)4.2,98);


        System.out.println("hmap.size() = " + hmap.size());

        System.out.println("hmap = " + hmap);
        

    }
}
