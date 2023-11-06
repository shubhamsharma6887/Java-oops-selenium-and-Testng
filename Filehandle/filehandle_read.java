package Filehandle;

import java.io.*;

public class filehandle_read {
    public static void main(String[] args) throws IOException {
        File sa = new File("G:/java/intellij/javatesting/src/Filehandle/fh.txt");
        FileReader sb = new FileReader(sa);
        BufferedReader sc = new BufferedReader(sb);
        String s="", s1="";
        while ((s=sc.readLine())!= null)
        {
            s1=s1+s+"\n";
        }
        System.out.println(s1);
    }
}
