package FileTasks;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static final String myFile="C:/Users/ACER/IdeaProjects/DersJava/src/FileTasks/Hello.txt";
    public static void main(String[] args) throws IOException {

        File test =new File(myFile);
        test.createNewFile();

        FileWriter testWriter =new FileWriter(test);
        testWriter.write("Kenan Musayev");
        testWriter.close();

        FileReader testReader =new FileReader(test);
        int nelerse;

        while ((nelerse = testReader.read()) != -1) {
            System.out.print((char) nelerse);
        }


    }
}
