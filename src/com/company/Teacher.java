package com.company;

public class Teacher extends Person {
    private String favSubToTeach;

    public Teacher(String schoolName, int roomNum, String name, int age, int grade, String favSubToTeach) {
        super(schoolName, roomNum, name, age, grade);

        this.favSubToTeach = favSubToTeach;
    }

}
