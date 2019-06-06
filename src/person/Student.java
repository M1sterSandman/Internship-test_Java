package person;

import person.consciousness.Knowledge;

public class Student {
    private String name;
    private Knowledge knowledge;

    public Student(String name, int level) {
        this.name = name;
        this.knowledge = new Knowledge(level);
    }


    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }

    public String getName() {
        return name;
    }

    public Integer getLevel() {
        return knowledge.getKnowledgeLevel();
    }
    @Override
    public String toString(){
        return name;
    }

}
