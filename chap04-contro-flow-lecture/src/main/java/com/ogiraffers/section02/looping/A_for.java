package com.ogiraffers.section02.looping;

import java.util.Random;

public class A_for {
    public void incNum(int a){
        for(int i=1;i<(a+1);++i)
            System.out.print(i+" ");
        System.out.println();
    }

    public void randomSum(int a){

        Random random = new Random();
        int sum=0;
        for(int i=0;i<a;++i) {
            int g = random.nextInt(5,10);
            System.out.println(sum+"+"+g+"=" );
            sum=sum+g;
            System.out.println(sum);
        }

    }

    public void googoodan(int a){
        for(int i=2;i<=a;i++){
            for(int j=1;j<=a;j++){
                System.out.print(i+"x"+j+"="+(i*j)+" ");
            }
            System.out.println();
        }
    }

    public void starTriRe(int a){
        for(int i=0;i<=a;i++){
            for(int j=0;j<(a-i);j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void starPiramid(int a){
        for(int i=0;i<=a;i++){
            for(int j=0;j<(a-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<(i*2);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void starDia(int a){
        a=a%2==0?a/2:a/2+1;
        for(int i=0;i<=a;i++){
            for(int j=0;j<(a-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<(i*2);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=a-1;i>0;i--){
            for(int j=0;j<(a-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<(i*2);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void snadClock(int a){
        int limit=a%2==0?a/2:a/2+1;
        for(int i=0;i<a;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            for(int j=0;j<a;j++){
                System.out.print("*");
            }
            System.out.println();
            a-=2;
        }
        for(int i=limit;i>0;i--){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }

            for(int j=0;j<a;j++){
                System.out.print("*");
            }
            System.out.println();
            a+=2;
        }
    }
}
