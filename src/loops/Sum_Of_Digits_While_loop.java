package loops;
import java.util.Scanner;
public class Sum_Of_Digits_While_loop {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number:");
        int x = sc.nextInt();
        int sum = 0;
        while (x!=0)
        {
            sum = sum+ x%10;
            x = x/10;

        }
        System.out.println(sum);

    }
}
