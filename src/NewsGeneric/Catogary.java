package NewsGeneric;

public class Catogary<T> {
    private T catogaryName;



    public Catogary(T catogaryName) {
        this.catogaryName = catogaryName;
    }

    public T getCatogaryName() {
        return catogaryName;
    }

    public void setCatogaryName(T catogaryName) {
        this.catogaryName = catogaryName;
    }
}
