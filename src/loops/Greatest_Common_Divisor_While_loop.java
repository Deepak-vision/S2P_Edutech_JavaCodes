package loops;
import java.util.Scanner;
public class Greatest_Common_Divisor_While_loop {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int x = sh.nextInt();
        System.out.println("Enter Second Number:");
        int y = sh.nextInt();

        while(x != y)
        {
            if(x>y)
            {
                x = x - y;

            }
            else
            {
                y = y -x;

            }
        }
        System.out.println("GREATEST COMMON DIVISOR:");
        System.out.println(x);
        
        }
    }

