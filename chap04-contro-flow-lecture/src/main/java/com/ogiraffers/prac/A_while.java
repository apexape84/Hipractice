package com.ogiraffers.prac;

public class A_while {
    public void incNum(int a){
        while(a!=0)
            System.out.print(a--+" ");
        System.out.println();
    }

    public void starTri(int a){
        int i=a;
        int j;
        while(i>0){
            j=i;
            while(a-j>0){
                System.out.print(" ");
                j++;
            }
            j=i;
            while(j>0){
                System.out.print("*");
                j--;
            }
            System.out.println();
            i--;
        }
    }

    public void starTriRe(int a){
        int i=a;
        int j;
        while(i>0){
            j=i;
            while(j>0){
                System.out.print(" ");
                j--;
            }
            j=i;
            while(a-j>0){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
    }

    public void starPiramid(int a){
        int limmit = a;
        int i=0;

        while(i<=limmit){
            int j=0;
            while(j<(limmit-i)){
                System.out.print(" ");
                j++;
            }
            j=0;
            while(j<(i*2-1)){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public void starDia(int a) {
        a = a % 2 == 0 ? a / 2 : a / 2 + 1;
        int i = 0;
        while (i <= a) {
            for (int j = 0; j < (a - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < (i * 2); j++) {
                System.out.print("*");
            }
            i++;
            System.out.println();
        }
        i=a-1;
        while(i > 0){
            for (int j = 0; j < (a - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < (i * 2); j++) {
                System.out.print("*");
            }
            i--;
            System.out.println();
        }
    }


    public void snadClock(int a){
        int half=a%2==0?a/2:(a/2+1);
        // 모래시계는 절반은 줄어들고, 나머지 반은 증가하므로 중간지점 찾기, 올림
        int blank=0;    // 빈칸갯수
        int star=a+2;   // 별 갯수-반복 전에 연산해야돼서 2를 더하고 빼면서 시작함
        int i;  // 반복문용 임시 변수

        while(blank<half){  // 빈칸 갯수가 중간점 까지 반복출력 하나
            i=1;
            blank++;    // 빈칸 갯수를 출력 이후에도 증가시키면 모래시계 중간이 안맞음
            star-=2;    // 같은이유로 별 갯수도 먼저계산함
            while(i<blank){
                System.out.print(" ");
                i++;
            }
            i=0;
            while(i<star){
                System.out.print("*");
                i++;
            }
            System.out.println();
        }

        while(blank>1){
            blank--;
            i=1;
            star+=2;
            while(i<blank){
                System.out.print(" ");
                i++;
            }
            i=0;
            while(i<star){
                System.out.print("*");
                i++;
            }
            System.out.println();
        }

    }

    public void googoodan(int a){
        int i=1;
        while(i<=a){
            int j=1;
            while(j<=a){
                System.out.print(""+i+"x"+j+"="+i*j+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
