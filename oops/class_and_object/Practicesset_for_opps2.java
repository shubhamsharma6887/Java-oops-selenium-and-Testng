package oops.class_and_object;

import java.util.*;
class Square{
    int side;
    public int areaofosquare(){
        return side*side;

    }

}
public class Practicesset_for_opps2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the side of square");
        int a = sc.nextInt();
        Square data = new Square();
        data.side = a;
        System.out.println("Area of Square is : "+data.areaofosquare());
    }
}
