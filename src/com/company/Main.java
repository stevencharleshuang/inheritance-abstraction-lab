package com.company;

public class Main {

    public static void main(String[] args) {
        // You'll need to design a program that manages a school.
        // The school has classrooms, and the classrooms have teachers and students assigned to them.
        // Each classroom contains students in a single grade (i.e., first, second, third, and so on).

        // You decide what the actions and properties of each class will be.

        // Requirements
        // At least one abstract class.
        // At least one interface.
        // At least three subclasses.
        // Each subclass must be unique from the others.
        // Bonus: Add extra classes, subclasses, or interfaces.

        // Instantiate School
        School school = new School("P.S. 36");

        Classroom firstGrade = new Classroom("P.S. 36", 1);
        Classroom secondGrade = new Classroom("P.S. 36", 2);
        Classroom thirdGrade = new Classroom("P.S. 36", 3);

        Teacher firstGradeTeacher = new Teacher("P.S. 36", 1, "Mrs. Caputo", 45, 1, "English");
        Student firstGraderSteve = new Student("P.S. 36", 1, "Steve", 6, 1, "Social Studies");
        Student firstGraderKat = new Student("P.S. 36", 1, "Kat", 6, 1, "English");
        Student firstGraderMarco = new Student("P.S. 36", 1, "Marco", 5, 1, "Math");

        Teacher secondGradeTeacher = new Teacher("P.S. 36", 2, "Mrs. Caputo", 45, 2, "Math");
        Student secondGraderStacey = new Student("P.S. 36", 2, "Stacey", 6, 2, "Science");
        Student secondGraderPaul = new Student("P.S. 36", 2, "Paul", 6, 2, "Art");
        Student secondGraderPolo = new Student("P.S. 36", 2, "Polo", 5, 2, "Music");

        firstGradeTeacher.takeAttendance();
        secondGradeTeacher.teachFavSub();

    }
}
