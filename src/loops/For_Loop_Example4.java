package loops;
import java.util.Scanner;
public class For_Loop_Example4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int n = input.nextInt();
        int m;
        for (int i = 1;i<=10; i++)
        {
            m = n*i;

//            System.out.printf("%d * %d = %d\n",n,i,m);
            System.out.println(n+"*" +i+ "="+m);

        }
    }
}
