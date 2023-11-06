package Filehandle;

import java.io.*;

public class binaryfilewrite {
    public static void main(String[] args) throws IOException {
        File sa = new File("G:/java/intellij/javatesting/src/Filehandle/binarydata.txt");
        String a = "hi how are you";
        byte [] array = a.getBytes();
        FileOutputStream sb = new FileOutputStream(sa);
        sb.write(array);
        sb.close();
        System.out.println("file created successfully");


    }
}
