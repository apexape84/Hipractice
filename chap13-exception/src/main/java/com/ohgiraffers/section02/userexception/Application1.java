
package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        /* title. 사용자 정의의 예외클래스 정의 후 발생한 예외를 처리할 수 있다. */

        ExceptionTest2 et = new ExceptionTest2();
        Scanner scanner = new Scanner(System.in);

        int i;
        do{
        try {
            System.out.println("숫자 두개를 넣어주세요");
            // 상품 가격 음수
            et.checkEnoughMoney(scanner.nextInt(), scanner.nextInt());
            // 가진 돈 음수
//            et.checkEnoughMoney(3000, -5000);
            // 물건의 가격이 가진 돈 보다 큼
//            et.checkEnoughMoney(10000, 5000);
            break;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
            System.out.println("종료를 원하시면 0을 입력하세요");
            i = scanner.nextInt();
        }while(i!=0);
    }
}
