package com.ogiraffers.section01.practice;

public class party2prac7 {
    public static void main(String[] args) {
        int hour = 24;
        hour=hour<24?hour:hour%24;

        String ampm = (hour < 12)? "AM" : "PM";

        System.out.println(ampm + ( hour +"시"));
    }
}
