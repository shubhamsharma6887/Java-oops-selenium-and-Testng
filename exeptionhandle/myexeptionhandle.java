import java.util.Scanner;
public class myexeptionhandle {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter your age");
            int age = sc.nextInt();
            if (age < 18) {
                throw new ArithmeticException("access denied because you are under 18");
            } else
                System.out.println("access granted");
        }
        catch (ArithmeticException r){
            System.out.println("access Denied because you are under 18");
        }
        finally {
            System.out.println("completed");
        }
    }
}
