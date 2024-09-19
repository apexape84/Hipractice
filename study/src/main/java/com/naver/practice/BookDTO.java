package com.naver.practice;

public class BookDTO {
    private int bookNo;
    private String name;
    private String writer;
    private int price;

    public BookDTO() {
    }

    public BookDTO(int bookNo, String name, String writer, int price) {
        this.bookNo = bookNo;
        this.name = name;
        this.writer = writer;
        this.price = price;
    }

    public int getBookNo() {
        return bookNo;
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "도서번호=" + bookNo +
                ", 도서명='" + name + '\'' +
                ", 저자='" + writer + '\'' +
                ", 가격=" + price +
                '}';
    }
}
