package OOPS;

class Circle{
    int radius;

    public double areaOfCircle(){

        double area= Math.PI*radius *radius;
        System.out.println(area);
        return area;
    }
    public double perimeterOfCircle(){
        double perimeter= 2* (Math.PI*radius);
        System.out.println(perimeter);
        return perimeter;
    }

}
public class Example3 {
    public static void main(String[] args) {
        Circle c1 =new Circle();
        c1.radius=1;
        c1.areaOfCircle();
        c1.perimeterOfCircle();

    }
}
