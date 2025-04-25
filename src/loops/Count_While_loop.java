package loops;
import java.util.Scanner;
public class Count_While_loop {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter the number to count :");
        int x= sh.nextInt();
        int count = 0;
        while(count<=x)
        {
            System.out.println(count);
            count++;
        }
    }
}
