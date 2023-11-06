package collection.list;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList cars = new ArrayList();   // non genric list support all data types
        //ArrayList <String> cars = new ArrayList<String>(); // genric list supports specifed data types
        cars.add("tata tiago");
        cars.add("tata harier");
        cars.add("tata nexon ");
        cars.add("tata altroz");
        cars.add("a");
        cars.add("c");
        cars.remove("a");
        cars.remove(4);
        System.out.println(cars);

        //for each loop
        for (Object q : cars){
            System.out.println(q);
        }

        //for loop
        for (int i=0;i<cars.size();i++){
            System.out.println(cars.get(i));
        }
    }
}
