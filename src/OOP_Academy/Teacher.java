package OOP_Academy;

public class Teacher extends Academy {
    public int teacherID;
    public String subject;

    public Teacher(){}

    public Teacher(String name, String localAddress, int teacherID, String subject) {
        super(name, localAddress);
        this.teacherID = teacherID;
        this.subject = subject;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void teacherInfo(){
        System.out.println("Muellimin ID-si : "+teacherID+", Muellimin Pesesi : "+subject);
    }

}
