package StudentHashSet;

import java.util.HashSet;
import java.util.Set;

public class StudentSetMethods {
    private Set<Student> telebeler ;

    public StudentSetMethods() {
        this.telebeler = new HashSet<>();
    }

    public  void addStudent(Student telebe){
        telebeler.add(telebe);
    }

    // Niye void yox Student ? cunki biz hansi tipde qaytarilacagini bildiririk  hansi tipe aid olacagi ucun secirik.
    // Telebeni id-ye gore axtararken, biz daxil etdiyimiz reqemi , student clasinda olan id-ye beraber etmeliyik.
    // for dongusunun icinde telebe siyahisini duzuruk sonra sert veririk . Eger bizim daxil etdiyimiz reqem
    // Student classi ile eynidirse bize onu hem cap et hemde return olaraq qaytar.

    public Student findStudent(int searchId)throws YalnisId{
        for (Student i : telebeler){
            if (i.getId() == searchId){
                System.out.println("Telebe Tapildi : "+i);
                return i;
            }

        }
        throw new YalnisId("Id-ye gore Telebe Tapilmadi");

    }

    public void studentList(){
        for (Student i : telebeler){
            System.out.println(i);
        }


    }
}
