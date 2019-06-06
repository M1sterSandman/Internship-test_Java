package main;

import institution.University;
import institution.Interlink.Internship;
import person.Student;



public class Application {


    public static void main(String[] args) {
        University university = new University("CH.U.I.");

        Student student1 = new Student("Andrew Kostenko", 45);
        Student student2 = new Student("Julia Veselkina", 80);
        Student student3 = new Student("Maria Perechrest", 90);

        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);

        Internship internship = new Internship("Interlink");
        internship.takeGpa(university.getGpa());

        System.out.println("List of internship's students:");


        System.out.println(internship.getStudents(university.getStudentsInfoList()));

    }
}
