package com.ogiraffers.section02.looping;

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
        int limit=a%2==0?a/2:a/2+1;
        int i=0;
        int j;

        while(i<a){
            j=0;
            while(j<i){
                System.out.print(" ");
                j++;
            }
            j=0;
            while(j<a){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
            a-=2;
        }
        i=limit;
        while(i>0){
            j=1;
            while(j<i){
                System.out.print(" ");
                j++;
            }

            j=0;
            while(j<a){
                System.out.print("*");
                j++;
            }
            System.out.println();
            a+=2;
            i--;
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
