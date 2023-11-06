package Filehandle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;

public class binaryfileread {
    public static void main(String[] args) throws IOException {
        File sa = new File("G:/java/intellij/javatesting/src/Filehandle/binarydata.txt");
        byte arr []= new byte[25];
        FileInputStream sb = new FileInputStream(sa);
        while (sb.read(arr)!=-1){
            String s = new String(arr);
            System.out.println(s);
        }
    }
}
