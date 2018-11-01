package institution;

import person.Student;
import java.util.ArrayList;

public class University {
    private String name;
    private Student student;
    private ArrayList<Student> StudentList;

    public University(String name) {
        this.name = name;
        this.StudentList = new ArrayList<Student>();
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void addStudent(Student student, Knowledge knowledge) {
        setStudent(student);
        this.student.setKnowledge(knowledge);
        this.StudentList.add(this.student);
    }

    public ArrayList<Student> getStudentList() {
        return StudentList;
        //implementation of mass reading
    }
}
