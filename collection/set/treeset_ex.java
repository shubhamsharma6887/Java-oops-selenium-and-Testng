package collection.set;

import java.io.FileOutputStream;
import java.util.TreeSet;

public class treeset_ex {
    public static void main(String[] args) {
        TreeSet <Integer> num = new TreeSet<Integer>();
        TreeSet <String> name = new TreeSet<String>();
        num.add(12);
        num.add(34);
        num.add(2);
        num.add(100);
        num.add(4);
        num.add(1);

        name.add("shubham");
        name.add("rishabh");
        name.add("yash");
        name.add("abhishek");

        System.out.println(name);
        for (Integer o:num){
            System.out.println(o);
        }
    }
}
