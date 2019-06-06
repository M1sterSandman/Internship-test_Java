package institution;

import person.Student;

import java.util.ArrayList;
import java.util.HashMap;


public class University{

    private ArrayList<Student> studentList;
    private ArrayList<Integer> levelList;
    private HashMap<Student, Integer> studentInfoList;
    private String name;
    private int gpa = 0;

    public University(String name) {
        this.name = name;
        studentList = new ArrayList<>();
        levelList = new ArrayList<>();
        studentInfoList = new HashMap<>();
    }

    public void setStudent(Student student) {
        this.studentList.add(student);
    }

    public void addStudent(Student student) {
        studentList.add(student);
        levelList.add(student.getLevel());
        this.gpa = calculateGpa(levelList);
        studentInfoList.put(student, student.getLevel());
    }

    public ArrayList<Student> getStudentList(){
        return studentList;
    }
    public void setStudentList(ArrayList<Student> studentList){
        this.studentList=studentList;
    }

    private Integer calculateGpa(ArrayList<Integer> levelList){
        Integer sum = 0;
        for(Integer d : levelList)
            sum += d;
        return sum / levelList.size();

    }
    public Integer getGpa(){
        return gpa;
    }
    public HashMap<Student, Integer> getStudentsInfoList(){
        return studentInfoList;
    }

    @Override
    public String toString(){
        return name;
    }
}