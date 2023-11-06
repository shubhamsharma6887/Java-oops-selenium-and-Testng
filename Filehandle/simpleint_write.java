package Filehandle;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class simpleint_write {
    public static void main(String[] args) throws IOException {
        File sa = new File("G:/java/intellij/javatesting/src/Filehandle/Simpleintrestdata.txt");
        FileWriter sb = new FileWriter(sa, true);
        BufferedWriter sc = new BufferedWriter(sb);
        Scanner un = new Scanner(System.in);
        double simple_interest, principal_amount, rate_of_interest, time_interval;
        System.out.println("To calculate simple interest");
        System.out.println("Enter your principal amount (borrowed money)");
        principal_amount = un.nextDouble();
        System.out.println("Enter rate of interest");
        rate_of_interest = un.nextDouble();
        System.out.println("Enter the time you borrowed money (In years)");
        time_interval = un.nextDouble();

        simple_interest = principal_amount*rate_of_interest*time_interval/100;
        sc.newLine();
        sc.write("Simple intrest on principal amount of "+principal_amount+" on rate of interest of "+rate_of_interest+ " percent on time interval of "+time_interval+" years is : "+simple_interest);
        sc.newLine();
        sc.close();
        System.out.println("Simple intrest on principal amount of "+principal_amount+" on rate of interest of "+rate_of_interest+ " percent on time interval of "+time_interval+" years is : "+simple_interest);
        System.out.println("File created successfully");

    }
}
