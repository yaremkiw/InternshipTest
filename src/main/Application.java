package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;

public class Application {
    public static void main(String[] args) {
        university.setStudents(createStudents());

        //show the list of university students
        for(Student student : source.getStudents()) {
            university.addStudent(student);
        }
        Internship internship = new Internship("Interlink");
        setInternship(university, internship);
        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());

        public static void setInternship(University university, Internship internship){
            for (Student student : university.getStudents()) {
                if (student.getKnowledge().getLevel() > university.getAverageLevel()) {
                    internship.setStudent(student);

                    //Browsing by Estimates

                }
            }
        }
        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
    }
}
