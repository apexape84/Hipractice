package com.ohgiraffers.section01.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application1 {
    public static void main(String[] args) {
        /* 컬렉션 프레임워크에 대해 이해할 수 있다.
        * Collection : 다음의 3가지의 인터페이스 중 한 가지를 상속받아 구현
        * 1. List 인터페이스 : Vector, ArrayList, LinkedList, Stack, Queue
        * 2. Set 인터페이스 : HashSet, TreeSet
        * 3. Map 인터페이스(Key+value) : HashMap, TreeMap, HashTable, Properties
        * */
        ArrayList alist = new ArrayList();
        // ArrayList는 기본적으로 10칸짜리 배열을 만들어준다.

        // List list = new List(); List가 인터페이스라 생성자 없음. class에 상속 받아서 사용해야 함

        List list = new ArrayList<>();
        //List를 상속받은 ArrayList를 사용함으로써 List의 기능까지 사용 가능한 인스턴스를 생성

        //Collections.sort();

        /*Iterator(반복자)란?
        * 인덱스가 없는 컬렉션에서는 반복문을 사용할 수 없으므로, 그것을 해결해줌.*/

    }
}
