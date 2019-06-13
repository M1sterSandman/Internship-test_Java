package institution.Interlink;


import person.Student;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Internship {

    private String name;
    private ArrayList<Student> suitableStudent;
    private Integer gpa;

    public Internship(String name) {
        this.name = name;
        suitableStudent = new ArrayList<>();
    }

    public void setStudent(Student student) {
        this.suitableStudent.add(student);
    }

    public void takeGpa(Integer gpa){
        this.gpa=gpa;
    }

    public ArrayList<Student> getStudents(ArrayList<Student> studentList){
        for(Student student : studentList){
            if (student.getLevel()>gpa){
                suitableStudent.add(student);
            }
        }
        return suitableStudent;
    }

}
