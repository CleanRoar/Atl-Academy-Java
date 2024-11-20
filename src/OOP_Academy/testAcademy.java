package OOP_Academy;

public class testAcademy {
    public static void main(String[] args) {
        academy test=new academy(" Atl_Academy","City Point Baku");
        test.disPlayInfo();
        System.out.println();

        student test2=new student(" Atl_Academy","City Point Baku "," Kenan", 123," Java Backend");
        test2.studentInfo();
        System.out.println();

        teacher test3=new teacher(" Atl_Academy","City Point Baku ",5,"Frontend");
        test3.teacherInfo();



    }
}
