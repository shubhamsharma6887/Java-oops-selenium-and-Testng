package collection.set;

import java.util.LinkedHashSet;

public class linkedhashsetex {
    public static void main(String[] args) {
        LinkedHashSet <Integer> number = new LinkedHashSet<Integer>(); // display element according to data insertion
        number.add(12);
        number.add(34);
        number.add(2);
        number.add(100);
        number.add(4);
        number.add(1);
        number.add(4);


        System.out.println(number);
    }
}
