package loops;
import java.util.Scanner;
public class For_Loop_Example9 {
    public static void main(String[] args) {
        int x;
        int n;
        int lLogNum =1;
        var Scan = new Scanner(System.in);
        System.out.print("Enter The Value of X :");
        x = Scan.nextInt();
        System.out.print("Enter The Value of n :");
        n = Scan.nextInt();

        for (int i = 0 ;i < n; i++)
        {
           lLogNum = lLogNum * x;

        }
        System.out.print("The Log of X^n is : "+ lLogNum);


    }
}
