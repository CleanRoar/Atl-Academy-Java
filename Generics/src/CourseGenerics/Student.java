package CourseGenerics;

import java.util.ArrayList;

public class Student {
    private String sutudentName;
    private int studentId;
    private ArrayList<Course> kurslar =new ArrayList<>();

    public Student(String sutudentName, int studentId) {
        this.sutudentName = sutudentName;
        this.studentId = studentId;
    }

    public String getSutudentName() {
        return sutudentName;
    }

    public void setSutudentName(String sutudentName) {
        this.sutudentName = sutudentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }



    public void movcutdur(Course<Student> movcutKurs){
        if (kurslar.contains(movcutKurs)){
            System.out.println("Bu kurs Movcutdur.");
        }

    }
    public void movcutDeyil(Course<Student> movcutKurs){
        if (!kurslar.contains(movcutKurs)){
            System.out.println("Bu kurs Movcut deyil.");
        }

    }

    public void telebeninKurslari(){
        for(Course <Student> i: this.kurslar){
            System.out.println(i);
        }
    }

    public void addKurs(Course<Student> kurs){
        this.movcutdur(kurs);
        kurslar.add(kurs);

    }
    public void removeKurs(Course<Student> kurs){
        this.movcutDeyil(kurs);
        kurslar.remove(kurs);

    }

    @Override
    public String toString() {
        return "Student{" +
                "sutudentName='" + sutudentName + '\'' +
                ", studentId=" + studentId +
                '}';
    }
}
