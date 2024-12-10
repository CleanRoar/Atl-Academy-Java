package StudentHashSet;

public class Main {
    public static void main(String[] args) {
        StudentSetMethods test = new StudentSetMethods();
        test.addStudent(new Student("Kenan",1));
        test.addStudent(new Student("Ali",10));
        test.addStudent(new Student("Ali",10));
        test.addStudent(new Student("Veli",8));
        test.addStudent(new Student("Adil",4));
        test.addStudent(new Student("Bagdagul",5));
        test.addStudent(new Student("Dasdamir",2));

        test.studentList();

        System.out.println();
        test.findStudent(1);

        try{
            test.findStudent(15);
        }
        catch (YalnisId e){
            System.out.println(e.getMessage());
        }



    }
}
