package OOP_Academy;

public class TestAcademy {
    public static void main(String[] args) {
        Academy test=new Academy(" Atl_Academy","City Point Baku");
        test.disPlayInfo();
        System.out.println();

        Student test2=new Student(" Atl_Academy","City Point Baku "," Kenan", 123," Java Backend");
        test2.studentInfo();
        System.out.println();

        Teacher test3=new Teacher(" Atl_Academy","City Point Baku ",5,"Frontend");
        test3.teacherInfo();

        Student telebe1=new Student(" Atl_Academy","City Point Baku ","Bagdagul",123,"OOP Kurs");
        Academy yeniTelebe1=new Academy();

        yeniTelebe1.addStudent(telebe1);



    }
}
