package com.company;

public class Classroom extends School {
    private int roomNum;

    public Classroom(String schoolName, int roomNum) {
        super(schoolName);

        this.roomNum = roomNum;
    }
}
