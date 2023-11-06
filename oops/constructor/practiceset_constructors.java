package oops.constructor;

class Cylinders{
    private double height;
    private double radius;
    private double volume;
    public void setHeight(double height){
        this.height = height;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getHeight(){
        return height;
    }
    public double getRadius(){
        return radius;
    }
    public double getVolume(){
        double volume = height*radius*radius*3.14;
        return volume;
    }
}
public class practiceset_constructors {
    public static void main(String[] args) {
        Cylinders mycylinder = new Cylinders();
        mycylinder.setHeight(4);
        mycylinder.setRadius(3);
        System.out.println("Height of cylinder : "+mycylinder.getHeight());
        System.out.println("Radius of cylinder : "+mycylinder.getRadius());
        System.out.println("Volume of cylinder : "+mycylinder.getVolume());
    }
}
