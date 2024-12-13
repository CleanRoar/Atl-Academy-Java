package CourseGenerics;

import java.util.ArrayList;
import java.util.List;

public class Course<T> {
    private T courseName;
    private List<T> telebeList=new ArrayList<>();
    private Subject subject;

    public Course(T courseName,  Subject subject) {
        this.courseName = courseName;
        this.telebeList = telebeList;
        this.subject = subject;
    }

    public T getCourseName() {
        return courseName;
    }

    public void setCourseName(T courseName) {
        this.courseName = courseName;
    }

    public List<T> getTelebeList() {
        return telebeList;
    }

    public void setTelebeList(List<T> telebeList) {
        this.telebeList = telebeList;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void addTelebe(T student){
        this.movcutKurs(student);
        telebeList.add(student);

    }

    public void removeTelebe(T student){
        this.movcutDeyilKurs(student);
        telebeList.remove(student);

    }

    public void listOfStudents(){
        for (T i : telebeList){
            System.out.println(i);
        }


    }

    public void movcutKurs(T kurs){
        if (telebeList.contains(kurs)){
            System.out.println("Telebe var ");
        }


    }

    public void movcutDeyilKurs(T kurs){
        if (!telebeList.contains(kurs)){
            System.out.println("Telebe yoxdur");
        }


    }
}
