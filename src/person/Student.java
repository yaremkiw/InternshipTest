package person;

import person.consciousness.Knowledge;

public class Student {
    private String name;
    private Knowledge knowledge;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Knowledge getKnowledge() {
        return knowledge;
    }
//realization of the designer this
    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }
}
