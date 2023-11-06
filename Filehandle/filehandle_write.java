package Filehandle;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filehandle_write {
    public static void main(String[] args) throws IOException {
        Scanner un = new Scanner(System.in);
        File sa = new File("G:/java/intellij/javatesting/src/Filehandle/fh.txt");
        FileWriter sb = new FileWriter (sa, true);
        BufferedWriter sc = new BufferedWriter(sb);
        String name, email, mobile, dob, address, hobbies;

        System.out.println("Welocme to shaadi.com \n Please Enter details to create your bio data");
        System.out.println("Enter your Name ");
        name = un.nextLine();
        sc.newLine();
        sc.write("Name : "+name);
        sc.newLine();
        System.out.println("Enter your Email address");
        email = un.nextLine();
        sc.write("Email : "+email);
        sc.newLine();
        System.out.println("Enter your Mobile Number");
        mobile = un.nextLine();
        sc.write("Mobile : "+mobile);
        sc.newLine();
        System.out.println("Enter your Date of birth");
        dob = un.nextLine();
        sc.write("Date Of Birth : "+dob);
        sc.newLine();
        System.out.println("Enter your Address");
        address = un.nextLine();
        sc.write("Address : "+address);
        sc.newLine();
        System.out.println();
        System.out.println("Enter about your hobbies");
        hobbies = un.nextLine();
        sc.write("Hobbies : "+hobbies);
        sc.close();
        System.out.println("file created successfully");

    }
}