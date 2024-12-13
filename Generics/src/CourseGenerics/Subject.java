package CourseGenerics;

public enum Subject {
    JAVA {
        @Override
        public void displayinfo() {
            System.out.println("Java Kursu");
        }
    },
    PYTHON {
        @Override
        public void displayinfo() {
            System.out.println("Python Kursu");
        }
    },
    PHP {
        @Override
        public void displayinfo() {
            System.out.println("Php Kursu");
        }
    };

    public abstract void displayinfo();
}
