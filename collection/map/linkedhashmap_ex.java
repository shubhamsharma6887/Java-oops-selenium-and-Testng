package collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class linkedhashmap_ex {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> student = new LinkedHashMap<Integer, String>();
        student.put(104,"yash");
        student.put(103, "abhishek");
        student.put(101, "shubham");
        student.put(102, "riahabh");

        System.out.println(student);


        Set<Map.Entry<Integer, String>> hold = student.entrySet();
        for (Map.Entry<Integer, String> ra : hold){
            System.out.println(ra.getKey() +" "+ ra.getValue());

        }

    }
}
