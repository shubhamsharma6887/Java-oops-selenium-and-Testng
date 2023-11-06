package oops.class_and_object;

class Vicecity{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("running from the enemy");
    }
    public void fire(){
        System.out.println("Firring on the enemy");
    }
}
public class practicesset_for_opps3 {
    public static void main(String[] args) {
        Vicecity tommy = new Vicecity();
        tommy.hit();
        tommy.run();
        tommy.fire();

    }
}
