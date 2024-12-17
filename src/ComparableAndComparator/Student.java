package ComparableAndComparator ;

public class Student {
    // implements  Comparable<Student>
    private String studentName;
    private int ID;

    public Student(String studentName, int ID) {
        this.studentName = studentName;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", ID=" + ID +
                '}';
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

//    @Override
//    public int compareTo(Student o) {
//        return this.studentName.compareTo(o.studentName);
//    }
}
