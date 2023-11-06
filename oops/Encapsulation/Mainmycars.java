package oops.Encapsulation;

public class Mainmycars {
    public static void main(String[] args) {
        My_cars c1= new My_cars();
        c1.setCarname("Ciaz");
        c1.setBrandname("Maruti Suzuki");
        c1.setMf_date(2023);
        System.out.println(c1.getCarname());
    }
}
