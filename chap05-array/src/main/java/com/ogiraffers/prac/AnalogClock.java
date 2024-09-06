package com.ogiraffers.prac;

public class AnalogClock {
    public static void main(String[] args) {
        int h1=11;
        int m1=59;
        int s1=30;
        int h2=12;
        int m2=0;
        int s2=0;
        int answer=0;

        /*초가 60 움직이면 분은 1 움직임
        * 분이 60 움직이면 시는 5 움직임
        * 1초:1 1분:1/60: 1시간: 5/3600
        * 1초의 속도 1초:720 1분:12 1시간:1
        * 시계전체 43200
        * 1시간은 3600
        * */


        int hPos=h1%12*3600+m1*60+s1;
        int mPos=m1*720+s1*12;
        int sPos=s1*720;

        int smh=0;
        int sm=0;
        int mh=0;
        int sh=0;

        System.out.println(""+hPos/3600+"시"+mPos/720+"분"+sPos/720+"초"+" end ");
        System.out.println(hPos+"시"+" "+mPos+"분"+" "+sPos+"초"+" end ");
        System.out.print(""+hPos/3600+"시"+mPos/720+"분"+sPos/720+"초"+" end ");
        System.out.println(answer);

        int nextHP = hPos+1;
        int nextMPos = mPos+12;
        int nextSPos = sPos+720;

        while(h1*3600+m1*60+s1<h2*3600+m2*60+s2){
            System.out.println(s1);


            if(mPos==hPos&&sPos<mPos&&sPos+720>mPos+12) //answer+=1;
            {
                smh += 1;
                System.out.println("" + hPos / 3600 + "시" + mPos / 720 + "분" + sPos / 720 + "초" + " smh ");
                System.out.println(hPos + "시" + " " + mPos + "분" + " " + sPos + "초" + " smh ");
                System.out.print(hPos + "시" + " " + (mPos + 12) + "분" + " " + (sPos + 720) + "초" + " smh ");
                System.out.println(smh);
            }

            else {
                if (sPos <= mPos && ((sPos + 720) >= (mPos + 12))){ //answer+=1;{
                    sm += 1;
                    System.out.println(""+hPos/3600+"시"+mPos/720+"분"+sPos/720+"초"+" sm ");
                    System.out.println(hPos+"시"+" "+mPos+"분"+" "+sPos+"초"+" sm ");
                    System.out.print(hPos+"시"+" "+(mPos+12)+"분"+" "+(sPos+720)+"초"+" sm ");
                    System.out.println(sm);
                }

                if (sPos <= hPos && ((sPos + 720) >= hPos + 1)) //answer+=1;
                {
                    sh += 1;
                    System.out.println(""+hPos/3600+"시"+mPos/720+"분"+sPos/720+"초"+" sh ");
                    System.out.println(hPos+"시"+" "+mPos+"분"+" "+sPos+"초"+" sh ");
                    System.out.print(hPos+"시"+" "+(mPos+12)+"분"+" "+(sPos+720)+"초"+" sh ");
                    System.out.println(sh);
                }
            }

                s1++;



            hPos%=(720*60);
            mPos%=(720*60);
            sPos%=(720*60);
        };
        answer=sh+mh+smh+sm;

        System.out.println(""+hPos/3600+"시"+mPos/720+"분"+sPos/720+"초"+" end ");
        System.out.println(hPos+"시"+" "+mPos+"분"+" "+sPos+"초"+" end ");
        System.out.print(""+hPos/3600+"시"+mPos/720+"분"+sPos/720+"초"+" end ");
        System.out.println(answer);

    }
}
