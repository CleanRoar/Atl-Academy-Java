import java.util.List;
import java.util.Objects;

public class Customer {
    private String name;
    private List<Hobby> hobbies;

    public Customer(String name, List<Hobby> hobbies) {
        this.name = name;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Hobby> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<Hobby> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name) && Objects.equals(hobbies, customer.hobbies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hobbies);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}
