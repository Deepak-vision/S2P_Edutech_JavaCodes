package Constructors;

class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        System.out.println("Radius :"+radius);
        this.height = height;
        System.out.println("Height :"+height);
    }

    public double volumeOfCylinder(){
        double volume = Math.PI *(radius*radius)*height;
        System.out.println("Volume Of Cylinder :"+volume);
        return volume;
    }
    public double surfaceAreaOfCylinder(){
        double surfaceArea = 2*Math.PI *radius*height + 2*Math.PI*radius*radius;
        System.out.println("Surface Area Of Cylinder :"+surfaceArea);
        return surfaceArea;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight() {
        return height;
    }

}
public class Example3 {
    public static void main(String[] args) {
      Cylinder C1 = new Cylinder(12,8);

      C1.volumeOfCylinder();
      C1.surfaceAreaOfCylinder();


    }
}
