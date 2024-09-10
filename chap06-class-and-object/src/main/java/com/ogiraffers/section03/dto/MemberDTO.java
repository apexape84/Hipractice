package com.ogiraffers.section03.dto;
/* DTO Dto VO 데이터를 캡슐화한 클래스 통칭
* Data transfer object
* Value object
*/

public class MemberDTO {
    private int memberNo;
    private String name;
    private int age;
    private char gender;
    private double height;
    private double weight;
    private Boolean isActivate;

    public void setMemberNo(int memberNo) {
        this.memberNo = memberNo;
    }

    public int getMemberNo() {
        return memberNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public Boolean getActivate() {
        return isActivate;
    }
}
