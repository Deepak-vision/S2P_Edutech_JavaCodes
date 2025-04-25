package loops;
import java.util.Scanner;
public class For_Loop_Example7 {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter The Number :");
        int n =sh.nextInt();
        int rev =0;
        int rem;
         for (int i=0;i!=n;n/=10)
        {
            rem = n%10;
            rev = rev * 10 +rem;

        }
        System.out.println(rev);
    }
}
