package Filehandle;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class salary_calculator {
    public static void main(String[] args) throws IOException {
        File sa = new File("G:/java/intellij/javatesting/src/Filehandle/Salarydata.txt");
        FileWriter sb = new FileWriter(sa);
        BufferedWriter sc = new BufferedWriter(sb);

        int total_salery, basic, ta, da, commission, pf;
        basic = 20000;
        ta = 2000;
        da =1000;
        commission = 500;
        pf = 2000;
        total_salery = basic+da+ta+commission+pf;

        sc.write("total salary of employee is : "+total_salery);
        sc.newLine();
        sc.close();
        System.out.println("total salary of employee is : "+total_salery);


    }
}
