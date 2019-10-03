package com.company;

public class Classroom extends School {
    private int roomNum;

    public Classroom(String schoolName, int roomNum) {
        super(schoolName);

        this.roomNum = roomNum;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }
}
