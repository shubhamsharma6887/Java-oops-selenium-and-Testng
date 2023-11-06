package collection.list;

import java.util.Stack;

public class Stackexample {
    public static void main(String[] args) {
        Stack <Integer> number = new Stack<Integer>();
        number.push(12);
        number.push(21);
        number.push(34);
        number.push(10);
        number.push(3);
        number.pop();
        number.pop();

        System.out.println(number);


    }
}
