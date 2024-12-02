package StudentRegisterOOP;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
       Student[] telebe =
               {new Student("Kenan", LocalDate.of(2005,3,30)),
                       new Student("Kenan", LocalDate.of(2005,3,30)),
                       new Student("Kenan", LocalDate.of(2005,3,30))} ;

        Student[] telebeClone = telebe.clone();

        Student[] telebeCopy = new Student[telebe.length];

//        for (int i = 0; i<telebe.length ; i++){
//            telebeCopy=telebe[i];
//        }

    }
}
