import java.util.Scanner;
public class exeptionhandle4 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any digit");
            String a = sc.nextLine();
            int s = Integer.valueOf(a);
            System.out.println("you entered digit : "+s);
        }
        catch (NumberFormatException r)
        {
            System.out.println("please enter a valid digit");
        }
    }
}
