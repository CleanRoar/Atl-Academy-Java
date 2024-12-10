import java.util.ArrayList;
import java.util.List;

public class Circus <T> {
    private List<T> scenes = new ArrayList<>();



    public void   add (T scene ){
         scenes.add(scene);


    }

    public T getScenes(int index) {
        return scenes.get(index);
    }

    public void setScenes(List<T> scenes) {
        this.scenes = scenes;
    }

    @Override
    public String toString() {
        return "Circus{" +
                "scenes=" + scenes +
                '}';
    }
}
