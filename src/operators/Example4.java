package operators;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {


        float a;
        float b;
        float c;

        float s;
        float area;

        Scanner sh = new Scanner(System.in);

        System.out.println("enter the length of triangle:");
        a = sh.nextFloat();
        System.out.println("enter the breath of triangle:");
        b = sh.nextFloat();
        System.out.println("enter the width of triangle:");
        c = sh.nextFloat();

        s = (a*b*c)/2f;

        area = (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("area of a traingle:" +area );


    }
}
