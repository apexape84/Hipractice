package com.ogiraffers.section03.practice;

public class RandomMaker {
    public int randomNumber(int max,int min){//범위 최대,최소
        int imax=(max>min?max:min);
        int imin=(max>min?min:max);

        return (int)(Math.random()*(imax-imin+1)+imin);
    }

    public String randomUpperAlpabet(int lenth){

        lenth=lenth<0?lenth*-1:lenth;

        char c=lenth>0?(char)(int)(Math.random()*(26)+65):' ';
        String s=""+c;
        lenth-=1;

        c=lenth>0?(char)(int)(Math.random()*(26)+65):' ';
        s+=c;
        lenth-=1;

        c=lenth>0?(char)(int)(Math.random()*(26)+65):' ';
        s+=c;
        lenth-=1;

        c=lenth>0?(char)(int)(Math.random()*(26)+65):' ';
        s+=c;
        lenth-=1;

        c=lenth>0?(char)(int)(Math.random()*(26)+65):' ';
        s+=c;
        lenth-=1;

        c=lenth>0?(char)(int)(Math.random()*(26)+65):' ';
        s+=c;
        lenth-=1;

        c=lenth>0?(char)(int)(Math.random()*(26)+65):' ';
        s+=c;
        lenth-=1;

        c=lenth>0?(char)(int)(Math.random()*(26)+65):' ';
        s+=c;
        lenth-=1;

        c=lenth>0?(char)(int)(Math.random()*(26)+65):' ';
        s+=c;
        lenth-=1;

        c=lenth>0?(char)(int)(Math.random()*(26)+65):' ';
        s+=c;
        lenth-=1;

        return s;
    }
    public String rockPaperScissors(){
        int a = (int)(Math.random()*3);
        System.out.print("가위바위보? :");
        return a>1?"가위":(a>0?"바위":"보");
    }
    public String tossCoin(){
        System.out.print("동전을 던졌습니다. 결과는? :");
        return (int)(Math.random()*2)>0?"앞면":"뒷면";
    }
}
