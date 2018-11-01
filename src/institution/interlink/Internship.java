package institution.interlink;

import person.Student;

public class Internship {
    private String name;
    private String InternshipsList;

    public Internship(String name) {
        this.name = name;
        this.InternshipsList = "";
    }

    public void setStudent(Student student) {
        this.InternshipsList += student.getName() + "\n";
    }//realization of the designer this

    public String getStudents() {
        return InternshipsList;
    }
}
