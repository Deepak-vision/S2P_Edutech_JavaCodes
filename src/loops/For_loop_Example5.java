package loops;
import java.util.Scanner;
public class For_loop_Example5 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter The Number :");
      int n = input.nextInt();
      int sum = 0;
      for (int i=1; i<=n;i++)
      {
          sum = sum + i;
      }
        System.out.print("Sum Of N Natural Numbers:"+sum);
    }
}
