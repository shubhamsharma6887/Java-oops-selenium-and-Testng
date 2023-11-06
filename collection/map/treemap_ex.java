package collection.map;

import java.util.Map;
import java.util.TreeMap;
import java.util.Set;

public class treemap_ex {
    public static void main(String[] args) {
        TreeMap <Integer, String> name = new TreeMap<Integer,String>();
        name.put(104,"yash");
        name.put(103, "abhishek");
        name.put(101, "shubham");
        name.put(102, "riahabh");

        System.out.println(name);

        Set<Map.Entry<Integer,String>> ok = name.entrySet();
        for (Map.Entry<Integer,String> k:ok){
            System.out.println(k.getKey()+" "+k.getValue());
        }

    }
}
