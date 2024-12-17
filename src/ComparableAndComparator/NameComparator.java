package ComparableAndComparator;

public class NameComparator implements java.util.Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getStudentName().compareTo(o2.getStudentName()) ;
    }
}
