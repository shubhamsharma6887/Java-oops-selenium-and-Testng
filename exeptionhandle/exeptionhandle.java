public class exeptionhandle {
    public static void main(String[] args) {
        try {
            int a = 4, b = 2;
            int c = a / b;
            System.out.println(c);
        }
        catch (ArithmeticException r){
            System.out.println("dinomitor is not be zero");
        } finally {
            System.out.println("completed");
        }
    }
}
