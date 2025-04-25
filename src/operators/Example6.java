package operators;

public class Example6 {
    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        int a;
        int b;

        b = 2*++x + 3*y++;
        a = 3*--x  + 2*++y;
        System.out.println("Result 1 : "+ b);
        System.out.println("Result 2 :"+ a);

    }
}
