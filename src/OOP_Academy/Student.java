package OOP_Academy;

public class Student extends Academy {
    public String telebeAdi;
    public int id;
    public String kurs;

    public Student(){}



    public Student(String name, String localAddress, String telebeAdi, int id, String kurs) {
        super(name, localAddress);
        this.telebeAdi = telebeAdi;
        this.id = id;
        this.kurs = kurs;
    }

    public String getTelebeAdi() {
        return telebeAdi;
    }

    public void setTelebeAdi(String telebeAdi) {
        this.telebeAdi = telebeAdi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKurs() {
        return kurs;
    }

    public void setKurs(String kurs) {
        this.kurs = kurs;
    }

    public void studentInfo(){
        System.out.println("Telebein ID-si :"+id+", Telebenin adi :"+telebeAdi+", Telebenin kursu :"+kurs);
    }


}
