package com.ogiraffers.prac;

public class AnalogClock {
    public static void main(String[] args) {
        int h1=0;
        int m1=0;
        int s1=0;
        int h2=23;
        int m2=59;
        int s2=59;
        int answer=0;

        double hPos=h1*3600*5%(3600*60);
        double mPos=m1*3600;
        int sPos=s1*3600;
        System.out.println("시침 "+hPos/3600+" 분침 "+mPos/3600+" 초침 "+sPos/3600);

        while(h1*3600+m1*60+s1<h2*3600+m2*60+s2){
            s1++;

            if(sPos<=mPos&&sPos+3600>mPos+60){
                answer+=1;
                System.out.println("시침 "+hPos/3600+" 분침 "+mPos/3600+" 초침 "+sPos/3600);
                System.out.println(answer);
            }

            if(sPos<=hPos&&(sPos+3600)>hPos+1){
                answer+=1;
                System.out.println("시침 "+hPos/3600+" 분침 "+mPos/3600+" 초침 "+sPos/3600);
                System.out.println(answer);

            }
            if(mPos<=hPos&&(mPos+60)>hPos+1){
                answer+=1;
                System.out.println("시침 "+hPos/3600+" 분침 "+mPos/3600+" 초침 "+sPos/3600);
                System.out.println(answer);
            }

            if(mPos==hPos){

                answer-=1;
                System.out.println("시침 "+hPos/3600+" 분침 "+mPos/3600+" 초침 "+sPos/3600);
                System.out.println(answer);
            }

            hPos+=1;
            mPos+=60;
            sPos+=3600;

            hPos%=(60*3600);
            mPos%=(60*3600);
            sPos%=(60*3600);
        };

        System.out.println(answer);
    }
}
