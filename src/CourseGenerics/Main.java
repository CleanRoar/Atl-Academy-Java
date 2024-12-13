package CourseGenerics;

public class Main {
    public static void main(String[] args) {
        Course<String> test =new Course<>("Atl Acedemy");

        test.addTelebe(new Student("Kenan",1));
        test.addTelebe(new Student("Ali",2));
        test.addTelebe(new Student("Veli",3));


        test.listOfStudents();
    }
}
