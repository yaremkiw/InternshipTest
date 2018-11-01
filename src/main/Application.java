package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        university.addStudent(new Student("Andrew Kostenko"), new Knowledge(4));
        university.addStudent(new Student("Julia Veselkina"), new Knowledge(2));
        university.addStudent(new Student("Maria Perechrest"), new Knowledge(5));

        Internship internship = new Internship("Interlink");
        for (Student student : university.getStudentList()) {
            if (student.getKnowledge().getLevel() > 3) {
                internship.setStudent(student);
            }
        }
        //Browsing by Estimates
        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
    }
}
