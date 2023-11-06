package collection.list;

import java.util.LinkedList;
import java.util.Vector;

public class linkedlist {
    public static void main(String[] args) {

        //LinkedList bike = new LinkedList();
        LinkedList <String> bike = new LinkedList<String>();
        bike.add("apache");
        bike.addFirst("Ninja H2R");
        bike.addLast("pulsure");
        bike.add("hero");
        bike.removeLast();
        bike.removeFirst();

        System.out.println(bike);

        for (Object o:bike){
            System.out.println(o);
        }
    }
}
