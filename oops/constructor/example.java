package oops.constructor;

class Cylinder{
    private int radius;
    private int height;
    public void setRadius(int radius){
        this.radius=radius;
    }
    public void setHeight(int height){
        this.height=height;
    }
    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }
    public Cylinder(int radius){
        this.radius = radius;
    }
    public Cylinder(int radius,int height){    //overloading of the constructor
        this.radius=radius;
        this.height=height;
    }

}
public class example{
    public static void main(String[] args) {
        Cylinder sc = new Cylinder(4);
        System.out.println(sc.getRadius());
        Cylinder sa = new Cylinder(0,56);
        System.out.println(sa.getRadius()+" "+sa.getHeight());
    }
}