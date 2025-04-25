package loops;
import java.util.Scanner;
public class For_Loop_Example8 {
    // plaindrome
    public static void main(String[] args)
    {
        int Number;
        int rem;
        int rev = 0 ;
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter The Integer Number :");
        Number = sh.nextInt();
        int Original = Number;
        for (int i = 0; Number!=i ;Number/=10)
        {
            rem = Number %10;
            rev = rev*10 + rem;

        }
        System.out.println("Reversed Number is :" +rev);
        if (Original == rev){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }
}
