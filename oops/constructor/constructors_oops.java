package oops.constructor;

class Mymainemployee{
    private int id;
    private String name;

    public void setId(int a){
        id =a;
    }
    public int getId(){
        return id;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public Mymainemployee(){    //this is called constructor
        id = 0;
        name = "your name here";
    }
    public Mymainemployee(int myid, String myname){  //this is called constructor with arguments
        id = myid;
        name= myname;
    }

}
public class constructors_oops {
    public static void main(String[] args) {
        Mymainemployee harry = new Mymainemployee(101,"swapnil panchal");
        System.out.println(harry.getId()+" "+harry.getName());
        Mymainemployee lerry = new Mymainemployee(102,"shubham sharma");
        System.out.println(lerry.getId()+" "+lerry.getName());
        Mymainemployee terry = new Mymainemployee();   // without any parameters
        System.out.println(terry.getId()+" "+terry.getName());


    }
}
