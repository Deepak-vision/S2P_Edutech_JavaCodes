package Methods;

public class Example11 {
    public static double printRectangleArea(double length,double breath){
        double area = length*breath;

        System.out.println("length:"+length);
        System.out.println("Breath:"+breath);
        System.out.println("Area of rectangle:"+area);
        System.out.println("---------------------------------------");
        return area;


    }
    public static void main(String[] args) {
        printRectangleArea(10,5);
        printRectangleArea(15,7);
        printRectangleArea(6,3);
        printRectangleArea(20,4);
        printRectangleArea(8,2.5);

    }
}
