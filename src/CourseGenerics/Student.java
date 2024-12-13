package CourseGenerics;

public class Student {
    private String sutudentName;
    private int studentId;

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

    @Override
    public String toString() {
        return "Student{" +
                "sutudentName='" + sutudentName + '\'' +
                ", studentId=" + studentId +
                '}';
    }
}
