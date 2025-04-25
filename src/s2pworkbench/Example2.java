package s2pworkbench;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter byte variable:");
        byte x1 = input.nextByte();
        System.out.println("Enter short variable:");
        short x2 = input.nextShort();
        System.out.println("Enter int variable:");
        int x3 = input.nextInt();
        System.out.println("Enter long variable:");
        long x4 = input.nextLong();
        System.out.println("Enter float variable");
        float x5 =input.nextFloat();
        System.out.println("Enter Double variable:");
        double x6 = input.nextDouble();
        System.out.println("Enter boolean variable:");
        boolean x7 = input.nextBoolean();
        System.out.println("Enter the char name");
        char x8 = input.next().charAt(0);
        System.out.println("Enter string values:");
        String x9 = input.next();
        String name = input.nextLine();
        System.out.println("Enter about me ");
        String aboutme = input.nextLine();

        // print the values
        System.out.println("Byte     : " + x1);
        System.out.println("Short    : " + x2);
        System.out.println("Integer  : " + x3);
        System.out.println("Long     : " + x4);
        System.out.println("Float    : " + x5);
        System.out.println("Double   : " + x6);
        System.out.println("bollean    : " + x7);
        System.out.println("char name :"+ x8);
        System.out.println("string name :" +name+x9);
        System.out.println("aboutme:"+aboutme);

    }
}
















