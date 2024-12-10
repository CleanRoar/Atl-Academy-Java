import java.util.Objects;

public class Scene {


    private String name;
    private int age;
    private int sceneTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSceneTime() {
        return sceneTime;
    }

    public void setSceneTime(int sceneTime) {
        this.sceneTime = sceneTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Scene scene = (Scene) o;
        return age == scene.age && sceneTime == scene.sceneTime && Objects.equals(name, scene.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sceneTime);
    }

    public Scene(String name, int age, int sceneTime) {
        this.name = name;
        this.age = age;
        this.sceneTime = sceneTime;
    }

    @Override
    public String toString() {
        return "Scene{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sceneTime=" + sceneTime +
                '}';
    }
}
