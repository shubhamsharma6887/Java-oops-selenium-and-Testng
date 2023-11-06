package oops.inheritance;

class Phone{
    private String caller;
    public void setCaller(String caller){
        this.caller=caller;
    }
    String getCaller(){
        return caller;
    }
    public void callme(){
        System.out.println("calling a person");
    }
    public void textme(){
        System.out.println("texting a person");
    }
}
class Smartphone extends Phone{    //here child class inherits all the properties of the parent class
    long number;
    public void setNumber(int number){
        this.number=number;
    }
    long getNumber(){
        return number;
    }
    public void videocall(){
        System.out.println("video calls a person");
    }
    public void whatsapp(){
        System.out.println("whatsapp a person");
    }

}
class Superphone extends Smartphone{

}
public class mobile {
    public static void main(String[] args) {
        Smartphone sc = new Smartphone();
        sc.setCaller("shubham");
        sc.setNumber(881743115);
        sc.callme();
        sc.textme();
        sc.videocall();
        sc.whatsapp();
        System.out.println(sc.getCaller()+" "+sc.getNumber());

        Superphone ss = new Superphone();
        ss.setCaller("shubham");
        ss.setNumber(838374);
        ss.callme();
        System.out.println(ss.getNumber()+" "+ss.getCaller());
    }
}
