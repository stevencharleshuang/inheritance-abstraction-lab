package com.company;

public class Student extends Person {
    private String favSubToLearn;

    public Student(String schoolName, int roomNum, String name, int age, int grade, String favSubToLearn) {
        super(schoolName, roomNum, name, age, grade);

        this.favSubToLearn = favSubToLearn;
    }
}
