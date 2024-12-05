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
}
