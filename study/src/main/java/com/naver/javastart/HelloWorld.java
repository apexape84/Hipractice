package com.naver.javastart;
// 패키지는 클래스가 많아지면 찾기 쉽게 구분해주는 인덱스 같이

public class HelloWorld {
    /* public : 공공장소 반대되는 것? 사유지
     * 우리는 공공장소가 아니면 컴퓨터 허락없이 프로그램속에 들어갈 수 없음
     * 그래서 프로그램이 시작하는 곳은 public 이어야 함.*/
    /* class : JAVA는 클래스로 설계한대로 동작하는 언어
    * HelloWorld : 내가 정한 클래스이름. 매 단어의 첫스펠은 대문자*/

    //변수

    public static void main(String[] args) {
        /* static : 고정해 놓고 쓰겠습니다.
         * void : 비어있어요, 형태를 나타내야 하는 위치인데 형태가 없어서
         * 비워놓았다는 것을 적은것
         * main : 프로그램 시작합니다!!
         * args : 지금은 쓰지 않습니다. 메소드에서 설명하겠습니다.*/
        System.out.println("Hello world");//출력하는 방법
        int age = 41;   // 변수형 변수명 =(대입연산자) 리터럴 ;(한마디 끝났다는 표시)
        String name = "이승현";    // 이런걸 변수 초기화 라고 함
        //String age = "마흔하나"; 형이 달라도 이름 같으면 안됨
        System.out.println(age-1+"살 "+name+"입니다");  //
    }

    //변수

    //System.out.println(age-1+"살 "+name+"입니다");  //

    /*메인 안에서만 동작함
    * 빨간줄 컴파일에러
    * 위에서 아래로 순차적으로 동작함*/

    /*위 예제에 저는을 넣어보기
    * 무엇인가 출력해보는 프로그램
    * 무엇인가 계산해보는 프로그램
    * */
}
