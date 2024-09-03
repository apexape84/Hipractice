package com.ogiraffers.section03.branching;

public class A_break {
    public void testBreakStatement(){

    }

    public void breakGoogoodan(int a){
        int i=1;
        while(i<=a){
            int j=1;
            while(j<=a){
                System.out.print(""+i+"x"+j+"="+i*j+" ");
                j++;
                if(i*j>150) break;
            }
            System.out.println();
            i++;
        }
    }
}
