package institution;

import person.Student;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class University{

    private ArrayList<Student> studentsList;
    private ArrayList<Integer> levelList;
    private String name;
    private int gpa = 0;

    public University(String name) {
        this.name = name;
        studentsList = new ArrayList<>();
        levelList = new ArrayList<>();
    }

    public void setStudent(Student student) {
        this.studentsList.add(student);
    }

    public void addStudent(Student student) {
        studentsList.add(student);
        this.levelList.add(student.getLevel());
        this.gpa = calculateGpa(levelList);
    }

    public ArrayList<Student> getStudentsList(){
        return this.studentsList;
    }

    public void setStudentList(ArrayList<Student> studentsList){
        this.studentsList=studentsList;
    }

    private Integer calculateGpa(ArrayList<Integer> levelList){
        Integer sum = 0;
        for (Integer d : levelList) {
            sum += d;
        }
        return sum / levelList.size();
    }

    public Integer getGpa(){
        return gpa;
    }

    @Override
    public String toString(){
        return name;
    }
}