package OOP_Academy;

public class Academy {

    private String name ;
    private String localAddress;
    private Student[] studentSize;
    private  int studentCount;

    public Academy(){}

    public void addStudent (Student Student){
        if(studentCount == studentSize.length){
            Student[] newStudent = new Student[studentSize.length+5];
            for (int i=0;i<studentSize.length;i++){
                newStudent[i] =studentSize[i];
            }
            studentSize=newStudent;
        }
        studentSize[studentCount] = Student;
        studentCount ++;
        System.out.println(Student.getName()+" telebe olaraq elave edildi .");


    }




    public Academy(String name, String localAddress) {
        this.name = name;
        this.localAddress =localAddress;
        this.studentCount=0;
        this.studentSize= new Student[10];
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocalAddress() {
        return localAddress;
    }

    public void setLocalAddress(String localAddress) {
        this.localAddress = localAddress;
    }

    public void disPlayInfo(){
        System.out.println("Kursun adi :"+name+", Kursun unvani : "+localAddress);
    }
}
