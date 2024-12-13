package CourseGenerics;

import java.util.ArrayList;
import java.util.List;

public class Course<T> {
    private T courseName;
    private List<Student> telebeList;

    public Course(T courseName) {
        this.courseName = courseName;
        this.telebeList = new ArrayList<>();
    }

    public T getCourseName() {
        return courseName;
    }

    public void setCourseName(T courseName) {
        this.courseName = courseName;
    }

    public List<Student> getTelebeList() {
        return telebeList;
    }

    public void setTelebeList(List<Student> telebeList) {
        this.telebeList = telebeList;
    }

    public void addTelebe(Student student){
        telebeList.add(student);
    }

    public void listOfStudents(){
        for (Student i : telebeList){
            System.out.println(i);
        }
    }
}
