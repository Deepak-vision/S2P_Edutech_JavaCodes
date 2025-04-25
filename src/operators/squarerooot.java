package operators;
import java.util.Scanner;
public class squarerooot {
    public static void main(String[] args) {
         float a;
         float b;
         float c;
         float area ;
         float s;

         Scanner input = new Scanner(System.in);


        System.out.println("Enter the value of A,B,C sides of triangle");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        s =(a+b+c)/2;
        System.out.println("print the value of s :"+s);
        area = (float) ( s*(s-a)*(s-b)*(s-c));
        System.out.println("area of traingle: "+ area);
    }
}