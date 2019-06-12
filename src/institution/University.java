package institution;

import person.Student;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class University{

    private HashMap<Student, Integer> studentInfoList;
    private String name;
    private int gpa = 0;

    public University(String name) {
        this.name = name;
        studentInfoList = new HashMap<>();
    }

    public void setStudent(Student student, Integer level) {
        this.studentInfoList.put(student, level);
    }

    public void addStudent(Student student) {
        studentInfoList.put(student, student.getLevel());
        this.gpa = calculateGpa(studentInfoList);

    }

    public HashMap<Student, Integer> getStudentList(){
        return this.studentInfoList;
    }

    public void setStudentList(HashMap<Student, Integer> studentInfoList){
        this.studentInfoList=studentInfoList;
    }

    private Integer calculateGpa(HashMap<Student, Integer> studentInfoList){
        Integer sum = 0;
        for (Map.Entry<Student, Integer> entry : studentInfoList.entrySet()) {
            for (Integer d : Arrays.asList(entry.getValue())) {
                sum += d;
            }
        }
        return sum / studentInfoList.size();
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