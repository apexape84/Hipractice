package com.naver.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ListQustion {
    public static void main(String[] args) {
        BookDTO book[] = new BookDTO[4];

        book[0] = new BookDTO(1,"논어","공자", 20000);
        book[1] = new BookDTO(3,"맹자","맹자", 20000);
        book[2] = new BookDTO(4,"탈무드","유대교랍비", 10000);
        book[3] = new BookDTO(5,"워렌버핏의주주서한","워렌버핏", 15000);

        ArrayList<BookDTO> bookArr =new ArrayList<BookDTO>();

        for(BookDTO b :book){
            bookArr.add(b);
            System.out.println(b.toString());
        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("책이름,저자,가격 순서로 입력해 주세요");

        BookDTO newbook=new BookDTO();
        newbook.setBookNo(2);
        newbook.setName(scanner.nextLine());
        newbook.setWriter(scanner.nextLine());
        newbook.setPrice(scanner.nextInt());

        bookArr.add(1,newbook);

        for(int i=0;i<bookArr.size();i++){
            System.out.println(bookArr.get(i));
        }
        for(BookDTO bookDTO:bookArr){
            System.out.println(bookDTO.toString());
        }
    }
}
