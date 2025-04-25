package OOPS;

import java.awt.geom.Area;

class Rectangle{
     int length;
     int breath;

     public double areaOfRectangle(){

         double Area = length*breath;
         System.out.println(Area);
         return Area;
     }
     public double perimeterOfRectangle(){
         double perimeter = 2*(length+breath);
         System.out.println(perimeter);
         return perimeter;
     }


}
public class Example4 {
    public static void main(String[] args) {

        Rectangle r1 =new Rectangle();
        r1.length=2;
        r1.breath=3;
        r1.areaOfRectangle();
        r1.perimeterOfRectangle();


    }
}
