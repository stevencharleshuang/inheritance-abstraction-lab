package com.company;

public class Student extends Person implements StudentActions {
    private String favSubToLearn;

    public Student(String schoolName, int roomNum, String name, int age, int grade, String favSubToLearn) {
        super(schoolName, roomNum, name, age, grade);

        this.favSubToLearn = favSubToLearn;
    }

    public String getFavSubToLearn() {
        return favSubToLearn;
    }

    public void setFavSubToLearn(String favSubToLearn) {
        this.favSubToLearn = favSubToLearn;
    }

    @Override
    public void yawn() {
        System.out.println(super.getName() + ": Yaaaaaaawwwwwnnn...");
    }

    @Override
    public void excitement() {
        System.out.printf(super.getName() +  ": Yea!!!\n");
    }

    @Override
    public void getSick() {
        System.out.println(super.getName() + ": I don't feel so good... Breghaawhgwhawwww... ");
    }

    public void react(String teachersFavSub) {
        if (teachersFavSub.equals(favSubToLearn)) {
            excitement();
        } else {
            yawn();
        }
    }
}
