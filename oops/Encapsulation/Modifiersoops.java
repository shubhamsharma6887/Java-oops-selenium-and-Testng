package oops.Encapsulation;

class Myemployee{
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

}
public class Modifiersoops {
    public static void main(String[] args) {
        Myemployee a = new Myemployee();
        a.setId(101);
        a.setName("swapnil gopu");
        System.out.println(a.getId());
        System.out.println(a.getName());

    }
}
