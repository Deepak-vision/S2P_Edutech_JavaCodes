package Inheritance;
/* To Inherit The Properties Of Rectangle */
class Rectangle{
    // Data Members
    private double length;
    private double breath;

    // Constructors
    public Rectangle(){
        System.out.println("Rectangle No Argument Constructor Called");
    }
    public Rectangle(double length,double breath){
        this.length = length;
        this.breath= breath;
        System.out.println("Rectangle All Argument Constructor Called");
    }
    // Getters & Setters
    public void setLength(double length){
        this.length=length;
    }
    public double getLength(){
        return length;
    }
    public void setBreath(double breath){
        this.breath=breath;
    }
    public double getBreath(){
        return breath;
    }

    // Implement Functions
    public double areaOfRectangle(){
        double area = this.length * this.breath;
        return area;
    }
    public double perimeterOfRectangle(){
        double perimeter = 2* (length+breath);
        return perimeter;
    }

}
class Cuboid extends Rectangle{
    // Data Members
    private double height;

    // Constructors
    public Cuboid(){
        super();
        System.out.println("Cuboid With No Argument Constructor Called");
    }
    public Cuboid(double length,double breath,double height){
        super(length,breath);
        this.height=height;
        System.out.println("Cuboid With All Argument Constructor Called");
    }
    // Getters & Setters
    public void setHeight(double height){
        this.height=height;
    }
    public double getHeight(){
        return height;
    }
    // Implement Cuboid Functions
    public double volumeOfCuboid(){
        double vol = this.getLength()* this.getBreath()*getHeight();
        return vol;
    }

    public double surfaceAreaOfCuboid(){
        double sF = 2*(this.getLength()*this.getBreath() + this.getBreath()*getHeight() + getHeight()*this.getLength());
        return sF;
    }
}
public class Example2 {
    public static void main(String[] args) {
        /* For RECTANGLE
        // All Argument Constructor Called
//        Rectangle r1 =  new Rectangle(2,4);
//        System.out.println(r1.areaOfRectangle());
//        System.out.println(r1.perimeterOfRectangle());

        // No Argument Constructor Called
//        Rectangle r2 = null;
//        r2 = new Rectangle();
//        r2.setLength(2);
//        r2.setBreath(4);
//        System.out.println(r2.areaOfRectangle());
//        System.out.println(r2.perimeterOfRectangle());
*/

        // Cuboid With All Argument Constructor
//        Cuboid c1 = new Cuboid(2,3,4);
//        System.out.println(c1.volumeOfCuboid());
//        System.out.println(c1.surfaceAreaOfCuboid());
//        System.out.println(c1.areaOfRectangle());
//        System.out.println(c1.perimeterOfRectangle());

        // Cuboid With No Argument Constructor Called
        Cuboid c2 = null;
        c2 = new Cuboid();
        c2.setLength(2);
        c2.setBreath(3);
        c2.setHeight(4);
        System.out.println(c2.areaOfRectangle());
        System.out.println(c2.perimeterOfRectangle());
        System.out.println(c2.volumeOfCuboid());
        System.out.println(c2.surfaceAreaOfCuboid());

    }
}
