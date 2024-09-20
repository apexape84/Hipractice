package com.naver.calculrator;

public class ExceptionCheck {
    public void checkCommand(String str, int a)throws   // 연산자체크, 첫번째 숫자를 받아온다.
            NoUseCommandException{
        if(a==0){   // 첫번째 숫자가 0일때
            switch (str.charAt(0)){
                case '*' : throw new NoUseCommandException("0은 뭐랑 곱해도 0입니다. 다른연산을 하세요");
                // 입력된 연산자가 * 이면 메세지를 보냄 throw로 이미 여기서 탈출하니 break안써도 됨
                case '+','-','%','/': break;
                // 입력된 연산자가 이것들이면 throw없이 돌아간다.
                default:throw new NoUseCommandException("사용하지 않는 부호입니다.");
                // 연산자가 아닌 것들이 입력되면 날리는 메세지
            }



        }else {     // 첫번째 숫자가 0이 아닐때
            switch (str.charAt(0)){
                case '+','-','*','%','/':break; // 정상
                default:throw new NoUseCommandException("사용하지 않는 부호입니다.");
                // 비정상
            }
        }
    }


    public void checkNum(String str, int a)throws   // 숫자체크, 연산자와 두번째 숫자를 받아온다
            DivideNotZeroException,
            MultipleNotZeroException{

        if(a==0) {  // 두번째 숫자가 0인데
            switch (str) {
                case "/", "%":  // 앞에 연산자가 나누기면 예외처리
                    throw new DivideNotZeroException("0으로 나누지 마세요");

                case "*":   // 앞에 연산자가 곱하기면 예외처리
                    throw new MultipleNotZeroException("0으로 곱하면 0이야 다른거");
            }
        }
    }
}
