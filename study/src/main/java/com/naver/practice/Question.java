package com.naver.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        ArrayList<BookDTO> bookArr =new ArrayList<BookDTO>(); // DTO타입 ArrayList 생성

        BookDTO book =new BookDTO(); // DTO인스턴스 생성
        bookArr.add(book= new BookDTO(1,"논어","공자", 20000));  // 책정보를 넣어 인스턴스를 만들고 ArrayList에 추가
        bookArr.add(book= new BookDTO(3,"맹자","맹자", 20000));
        bookArr.add(book=new BookDTO(4,"탈무드","유대교랍비", 10000));
        bookArr.add(book = new BookDTO(5,"워렌버핏의주주서한","워렌버핏", 15000));

        for(int i=0;i<bookArr.size();i++)         //Array길이만큼 반복해서 출력
            System.out.println(bookArr.get(i));

        Scanner scanner = new Scanner(System.in);
        System.out.println("책이름,저자,가격 순서로 입력해 주세요");

        bookArr.add(1,book= new BookDTO(2,scanner.nextLine(),scanner.nextLine(),scanner.nextInt()));
        // 인스턴스 생성자에 Scanner를 전달인자로 하여 입력을 받아 즉시 생성하고, 완성된 인스턴스를 ArrayList의 1번 인덱스(0부터시작)에 삽입

        for(BookDTO bookDTO:bookArr)    // 향상된 for문으로 출력
            System.out.println(bookDTO.toString());
    }
}
