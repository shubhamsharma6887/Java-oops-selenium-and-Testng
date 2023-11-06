package collection.set;

import java.util.HashSet;

public class hashsetexample {
    public static void main(String[] args) {
        HashSet<Integer> number = new HashSet<Integer>();  // hashset display elements randomly
        HashSet <String> student = new HashSet<String>();  // contain unique element
        student.add("shubham");
        student.add("rishabh");
        student.add("abhishek");
        student.add("khushal");
        student.add("yash");

        number.add(12);
        number.add(15);
        number.add(1);
        number.add(45);
        number.remove(1);

        System.out.println(number);

        for (Object o:student){
            System.out.println(o);
        }
    }
}
