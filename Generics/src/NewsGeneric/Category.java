package NewsGeneric;

public class Category<T> {
    private T catogaryName;



    public Category(T catogaryName) {
        this.catogaryName = catogaryName;
    }

    public T getCatogaryName() {
        return catogaryName;
    }

    public void setCatogaryName(T catogaryName) {
        this.catogaryName = catogaryName;
    }

    @Override
    public String toString() {
        return "Category{" +
                "catogaryName=" + catogaryName +
                '}';
    }
}
