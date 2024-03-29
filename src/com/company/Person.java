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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
