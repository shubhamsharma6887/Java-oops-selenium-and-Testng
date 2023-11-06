package serialization;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serialization_example {
    public static void main(String[] args) throws IOException {
        Student sa = new Student(123,"Shubham Sharma");
        FileOutputStream sb = new FileOutputStream("G:/java/intellij/javatesting/src/serialization/data.txt");
        ObjectOutputStream sc = new ObjectOutputStream(sb);
        sc.writeObject(sa);
        sc.close();
        System.out.println("File created successfully ");

    }
}
