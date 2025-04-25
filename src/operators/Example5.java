import java.util.Scanner;
    public class Example5 {
        public static void main(String[] args)
        {
            int a;
            int b;
            int c;

            float root1;
            float root2;

            Scanner Input = new Scanner(System.in);

            System.out.println("Enter The Value Of A , B , C");

            a = Input.nextInt();
            b = Input.nextInt();
            c = Input.nextInt();

            root1 = (float) (-b + Math.sqrt((b*b) - 4*a*c))/ (2*a);
            root2 = (float) (b  + Math.sqrt((b*b) - 4*a*c)) / (2*a);

            System.out.println("Root-1 : " + root1);
            System.out.println("Root-2 : " + root2);
        }
    }