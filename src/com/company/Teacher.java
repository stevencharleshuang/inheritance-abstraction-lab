package com.company;

public class Teacher extends Person implements TeacherActions {
    private String favSubToTeach;

    public Teacher(String schoolName, int roomNum, String name, int age, int grade, String favSubToTeach) {
        super(schoolName, roomNum, name, age, grade);

        this.favSubToTeach = favSubToTeach;
    }

    public String getFavSubToTeach() {
        return favSubToTeach;
    }

    public void setFavSubToTeach(String favSubToTeach) {
        this.favSubToTeach = favSubToTeach;
    }

    @Override
    public void takeAttendance() {
        System.out.println("(Grade " + super.getGrade() + " Teacher) " + super.getName() + ": Role Call!");
    }

    @Override
    public void teachFavSub() {
        System.out.println("(Grade " + super.getGrade() + " Teacher) " + super.getName() + ": Today's lesson will be on " + favSubToTeach + "!!!");
    }
}
