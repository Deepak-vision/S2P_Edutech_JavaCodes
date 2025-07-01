package Inheritance;
/* To Inherit The Properties Of Circle*/

class Circle{
    // Data members
    private double radius;

    // Constructors
    public Circle(){
        System.out.println("Circle Using No Argument Constructor Called");
    }
    public Circle(double radius){
        this.radius =radius;
        System.out.println("Circle Using All Argument Constructor Called");
    }

    // Getters And Setters
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public double areaOfCircle(){
        double area = Math.PI * this.radius *this.radius;
        return area;
    }
    public double perimeterOfCircle(){
        double perimeter = 2 * Math.PI *this.radius;
        return perimeter;
    }
}
class Cylinder extends Circle{
    // Data Members
    private double height;

    // Constructors
    public Cylinder(){
        super();
        System.out.println("Cylinder No Argument Constructor Called ");
    }
    public Cylinder(double radius,double height){
        super(radius);
        this.height= height;
        System.out.println("Cylinder All Argument Constructor Called");
    }
    // Create Functions
    public double volumeOfCylinder(){
        double vol = Math.PI *this.getRadius() * this.getRadius() *height;
        return vol;
    }

    public double totalSurfaceAreaOfCylinder(){
        double surfaceArea = 2*Math.PI *this.getRadius()*this.getRadius() + 2*Math.PI*this.getRadius()*height;
        return surfaceArea;
    }
}
public class Example1 {
    public static void main(String[] args) {

        // All Argument Constructor
//        Circle c1 =new Circle(4);
//        System.out.println(c1.areaOfCircle());
//        System.out.println(c1.perimeterOfCircle());

//         No Argument Constructor
//        Circle c1 = null;
//        c1 = new Circle();
//        c1.setRadius(4);
//        System.out.println( c1.areaOfCircle());
//        System.out.println(c1.perimeterOfCircle());

        Cylinder c2 = new Cylinder(4,5);
        System.out.println(c2.volumeOfCylinder());
        System.out.println(c2.totalSurfaceAreaOfCylinder());
        System.out.println(c2.areaOfCircle());
        System.out.println(c2.perimeterOfCircle());
    }
}
