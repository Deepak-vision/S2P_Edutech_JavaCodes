package loops;
import java.util.Scanner;
public class For_Loop_Example2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Number :");
        int i = input.nextInt();

        for (int j=0;j<=i;i--)
        {
            System.out.println(i);
        }
    }
}
