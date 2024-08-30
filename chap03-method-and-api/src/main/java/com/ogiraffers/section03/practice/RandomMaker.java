package com.ogiraffers.section03.practice;

public class RandomMaker {
    public int randomNumber(int num1,int num2){//범위 숫자 두개
        int max=(num1>num2?num1:num2); //큰수 찾기
        int min=(num1>num2?num2:num1); //작은수 찾기

        return (int)(Math.random()*(max-min+1)+min);
    }


    public String randomUpperAlpabet2(int length){  // 문자열길이

        return length==0?"문자열 길이가 0입니다":(length>100?"100개만 하라고":repeater(length));
        // 100개 이하인 경우만 생성함
    }

    public static String repeater(int length){  // String 만들기 10번 반복하는 method
        String s = length>0?(makeString(length)):"";    // 실제로 만드는 애는 얘
        length=length-10;   // 위 메소드에서 10글자 만들어서 다음은 전체에서 10개 빼고

        s=s+(length>0?(makeString(length)):"");
        length=length-10;

        s=s+(length>0?(makeString(length)):"");
        length=length-10;

        s=s+(length>0?(makeString(length)):"");
        length=length-10;

        s=s+(length>0?(makeString(length)):"");
        length=length-10;

        s=s+(length>0?(makeString(length)):"");
        length=length-10;

        s=s+(length>0?(makeString(length)):"");
        length=length-10;

        s=s+(length>0?(makeString(length)):"");
        length=length-10;

        s=s+(length>0?(makeString(length)):"");
        length=length-10;

        s=s+(length>0?(makeString(length)):""); // 10글자 만들기 10번 반복 = 100글자

        return s;

    }
    public static String makeString(int lenth)  // 문자(char)10개 만들어서 스트링으로 반환하는 method
    {
        char c=lenth>0?(char)(int)(Math.random()*(26)+65):' ';
        // 문자열 길이가 0보다 클때 대문자 한글자 랜덤생성, 0보다 작으면 공백문자를 반환
        String s=""+c;  // char를 String으로 만드는 꼼수.
        lenth-=1;   // 하나 만들었으니까 앞으로 만들 문자열 길이 1 줄여줌

        c=lenth>0?(char)(int)(Math.random()*(26)+65):' ';
        s=c!=' '?s=s+c:s;   // char가 공백문자가 아니면 앞에서 만든 문자열에 이번에 만든 char더하기
        lenth-=1;

        c=lenth>0?(char)(int)(Math.random()*(26)+65):' ';
        s=c!=' '?s=s+c:s;
        lenth-=1;

        c=lenth>0?(char)(int)(Math.random()*(26)+65):' ';
        s=c!=' '?s=s+c:s;
        lenth-=1;

        c=lenth>0?(char)(int)(Math.random()*(26)+65):' ';
        s=c!=' '?s=s+c:s;
        lenth-=1;

        c=lenth>0?(char)(int)(Math.random()*(26)+65):' ';
        s=c!=' '?s=s+c:s;
        lenth-=1;

        c=lenth>0?(char)(int)(Math.random()*(26)+65):' ';
        s=c!=' '?s=s+c:s;
        lenth-=1;

        c=lenth>0?(char)(int)(Math.random()*(26)+65):' ';
        s=c!=' '?s=s+c:s;
        lenth-=1;

        c=lenth>0?(char)(int)(Math.random()*(26)+65):' ';
        s=c!=' '?s=s+c:s;
        lenth-=1;

        c=lenth>0?(char)(int)(Math.random()*(26)+65):' ';
        s=c!=' '?s=s+c:s;



        return s;
    }

    public String rockPaperScissors(){
        int a = (int)(Math.random()*3);
        System.out.print("가위바위보? : ");
        return a>1?"가위":(a>0?"바위":"보");
    }
    public String tossCoin(){
        System.out.print("동전을 던졌습니다. 결과는? : ");
        return (int)(Math.random()*2)>0?"앞면":"뒷면";
    }


    public String randomUpperAlpabet(int lenth){    //사용안함-초기버전

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
}
