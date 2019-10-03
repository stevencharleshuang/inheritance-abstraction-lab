package com.company;

public class Person extends Classroom {
    private String name;
    private int age;
    private int grade;

    public Person(String schoolname, int roomNum, String name, int age, int grade) {
        super(schoolname, roomNum);

        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
