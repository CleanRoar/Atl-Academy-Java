package NewsGeneric;

public class Author<T> {
    private T firstName ;
    private T lastName;

    public Author(T firstName, T lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public T getFirstName() {
        return firstName;
    }

    public void setFirstName(T firstName) {
        this.firstName = firstName;
    }

    public T getLastName() {
        return lastName;
    }

    public void setLastName(T lastName) {
        this.lastName = lastName;
    }

    public void fullAuthorName(){
        System.out.println(firstName+" "+lastName);
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName=" + firstName +
                ", lastName=" + lastName +
                '}';
    }
}
