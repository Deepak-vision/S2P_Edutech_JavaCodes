package loops;
import java.util.Scanner;
public class For_Loop_Example6 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Number :");
        int n = input.nextInt();
        int prod =1;
        for (int i  =1 ; i <=n;i++)
        {
            prod= prod * i;

        }
        System.out.println("Factorial of N number is :"+prod);
    }
}
