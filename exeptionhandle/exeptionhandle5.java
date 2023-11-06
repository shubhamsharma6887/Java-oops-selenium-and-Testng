public class exeptionhandle5 {
    public static void main(String[] args) {
           try {
               String str = null;
               System.out.println(str.length());
           }
           catch (NullPointerException r){
               System.out.println("string has a null value");
           }

    }
}
