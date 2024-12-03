import java.util.Objects;

public class Hobby {
    private String hobbyName;
    private String catogary;
    private Integer limitAge;

    public Hobby(String hobbyName, String catogary, int limitAge) {
        this.hobbyName = hobbyName;
        this.catogary = catogary;
        this.limitAge = limitAge;
    }

    public String getHobbyName() {
        return hobbyName;
    }

    public void setHobbyName(String hobbyName) {
        this.hobbyName = hobbyName;
    }

    public String getCatogary() {
        return catogary;
    }

    public void setCatogary(String catogary) {
        this.catogary = catogary;
    }

    public int getLimitAge() {
        return limitAge;
    }

    public void setLimitAge(int limitAge) {
        this.limitAge = limitAge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hobby hobby = (Hobby) o;
        return limitAge == hobby.limitAge && Objects.equals(hobbyName, hobby.hobbyName) && Objects.equals(catogary, hobby.catogary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hobbyName, catogary, limitAge);
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "hobbyName='" + hobbyName + '\'' +
                ", catogary='" + catogary + '\'' +
                ", limitAge=" + limitAge +
                '}';
    }
}
