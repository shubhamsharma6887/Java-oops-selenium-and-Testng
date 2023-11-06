import java.util.Scanner;
import java.util.InputMismatchException;
public class exeptionhandle3 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the first number");
            int a = sc.nextInt();
            System.out.println("enter the second number");
            int b = sc.nextInt();
            int c = a + b;
            System.out.println(c);
        }
        catch (InputMismatchException r)
        {
            System.out.println("input can't be alphabetic or special charactor");
        }
        finally {
            System.out.println("completed");
        }
    }
}
