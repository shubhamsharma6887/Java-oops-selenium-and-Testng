package collection.map;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;

public class hashmap_ex {
    public static void main(String[] args) {
        HashMap <Integer, String> student = new HashMap<Integer, String>();
        //Scanner sc = new Scanner(System.in);
        // System.out.println("Enter roll number to get details");
        //int un = sc.nextInt();
        student.put(101, "shubham");
        student.put(102, "riahabh");
        student.put(103, "abhishek");
        student.put(104,"yash");

       /*
       if (student.get(un) != null) {

            System.out.println(student.get(un));
        }
        else
        {
            System.out.println("Enter valid roll number ");
        }
        */
        Set<Map.Entry<Integer, String>> hold = student.entrySet();
        for (Map.Entry<Integer, String> ra : hold){
            System.out.println(ra.getKey() +" "+ ra.getValue());

        }

    }
}
