package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class deserialization_example {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student sa = null;
        FileInputStream sb = new FileInputStream("G:/java/intellij/javatesting/src/serialization/data.txt");
        ObjectInputStream sc = new ObjectInputStream(sb);
        sa = (Student)sc.readObject();
        System.out.println(sa.name+" "+sa.rollnumber);

    }
}
