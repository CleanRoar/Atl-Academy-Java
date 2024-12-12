import java.time.LocalDate;
import java.util.Objects;

public class Human {
    private String name;
    private LocalDate dogumTarixi;
    private int yas;

    public Human() {

    }

    public Human(String name, LocalDate dogumTarixi, int yas) {
        this.name = name;
        this.dogumTarixi = dogumTarixi;
        this.yas = yas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDogumTarixi() {
        return dogumTarixi;
    }

    public void setDogumTarixi(LocalDate dogumTarixi) {
        this.dogumTarixi = dogumTarixi;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return yas == human.yas && Objects.equals(name, human.name) && Objects.equals(dogumTarixi, human.dogumTarixi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dogumTarixi, yas);

    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", dogumTarixi=" + dogumTarixi +
                ", yas=" + yas +
                '}';
    }
}
